import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class DailyReportGenerator {

    private static final Map<Integer, Chapter> chapters = new HashMap<>();

    static {
        chapters.put(1, new Chapter(
                "第1章 インスタンスの基本操作",
                List.of(
                        "１．インスタンスの5台基本操作",
                        "２．インスタンスの文字列表現",
                        "３．インスタンスの等価判定",
                        "４．インスタンスの要約",
                        "５．インスタンスの順序付け",
                        "６．インスタンスの複製",
                        "７．レコード",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(2, new Chapter(
                "第2章 さまざまな種類のクラス",
                List.of(
                        "１．型安全という価値",
                        "２．ジェネリクス",
                        "３．列挙型",
                        "４．シールクラス",
                        "５．インナークラス",
                        "６．null安全性",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(3, new Chapter(
                "第3章 関数とラムダ式",
                List.of(
                        "１．関数",
                        "２．関数の代入",
                        "３．ラムダ式",
                        "４．関数オブジェクトの活用",
                        "５．SteamAPI",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(4, new Chapter(
                "第4章 JVM制御とリフレクション",
                List.of(
                        "１．JVMへのアクセス",
                        "２．JVMの終了",
                        "３．外部プログラムの実行",
                        "４．システムプロパティの利用",
                        "５．ロケールと国際化",
                        "６．メモリに関する状態の取得",
                        "７．リフレション",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(5, new Chapter(
                "第5章 非標準ライブラリの活用",
                List.of(
                        "１．ライブラリとは",
                        "２．クラスパスの幼い",
                        "３．commons-lang　を使ってみよう",
                        "４．ログ出力ライブラリ",
                        "５．オープンソースとライセンス",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(6, new Chapter(
                "第6章 外部資源へのアクセス",
                List.of(
                        "１．ファイル操作の前提知識",
                        "２．テキストファイルの読み書き",
                        "３．バイナリファイルの読み書き",
                        "４．ファイル操作の落とし穴",
                        "５．ストリームの概念",
                        "６．フィルタの活用",
                        "７．ファイルシステムの操作",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(7, new Chapter(
                "第7章 さまざまなファイル形式",
                List.of(
                        "１．データフォーマット",
                        "２．CSV形式",
                        "３．プロパティファイル形式",
                        "４．XML形式",
                        "５．JSON形式",
                        "６．オブジェクトの値列化",
                        "７．さまざまなフォーマット",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(8, new Chapter(
                "第8章 ネットワークアクセス",
                List.of(
                        "１．ネットワークAPIの全体像",
                        "２．Soketを用いた低水準アクセス",
                        "３．サ ー バ側ソフトウェアの開発",
                        "４．HTTP と WebAPI",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(9, new Chapter(
                "第9章 データベースアクセス",
                List.of(
                        "１. デ ー タベ ー スとha",
                        "２．データベースの基本操作",
                        "３．デ ー タベ ー スの接続と切断",
                        "４．更新糸SQL文の送信",
                        "５．検索糸SQL文の昇進",
                        "６．結果表の処理",
                        "７．java とDBのデータ型",
                        "８．トランザクション処理",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(10, new Chapter(
                "第10章 基本的な開発ツール",
                List.of(
                        "１．javaが備える基本ツール",
                        "２．JDK",
                        "３．javadoc-----仕様書の自動生成",
                        "４．javac-----コンパイル",
                        "５．jar-----アーカイブの操作",
                        "６．java-----JVMの起動と実行",
                        "７．jshell-----Javaの対話的実行",
                        "８．統合開発環境",
                        "９．Ant",
                        "１０．Maven",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(11, new Chapter(
                "第11章 単体テストとアサーション",
                List.of(
                        "１．不具合に対するアプローチ",
                        "２．単体テストの方法",
                        "３．JUnitを用いたテスト",
                        "４．アサーション",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(12, new Chapter(
                "第12章 メトリクスとリファクタリング",
                List.of(
                        "１．品質の「見える化」",
                        "２．さまざまなメトリスク",
                        "３．リファクタリング",
                        "４．コードの静的解析",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(13, new Chapter(
                "第13章 ソースコードの管理と共有",
                List.of(
                        "１．チームによる開発",
                        "２．ソースコードの共有",
                        "３．Gitの基礎",
                        "４．Gitツールの利用",
                        "５．競合の発生と解決",
                        "６．ブランチ",
                        "８．Gitサーバ",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(14, new Chapter(
                "第14章 アジャイルな開発",
                List.of(
                        "１．チーム開発の基盤",
                        "２．共通の言葉",
                        "３．共通の手順",
                        "４．アジャイルという価値観",
                        "５．エクスとリーム・プログラミング（XP）",
                        "６．スクラム（Scrum）",
                        "７．断続的デブロイメント",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(15, new Chapter(
                "第15章 設計の原則とデザインパターン",
                List.of(
                        "１．優れた設計の原則",
                        "２．コード記述全般に関する原則",
                        "３．クラスの設計に関する原則",
                        "４．クラスの関係に関する原則",
                        "５．デザインパターン",
                        "６．Facade-----内部を隠してシンプルに",
                        "７．Singleton-----唯一無ニの存在",
                        "８．Strategy-----プラグインの切り替え",
                        "９．TemplateMethod-----大まかなシナリオ",
                        "１０．モジュール",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(16, new Chapter(
                "第16章 スレッドによる並列処理",
                List.of(
                        "１．処理効率の追求",
                        "２．javaにおける並列処理",
                        "３．スレッドセーブな設計",
                        "４．スレッド活用と高水準API",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(17, new Chapter(
                "第17章 ユーザーインタフェース制御",
                List.of(
                        "１．ユーザーインタフェース",
                        "２．ウィンドウUIの基礎",
                        "３．Swing API の起草",
                        "４．レイアウト",
                        "５．イベントハンドリング",
                        "・まとめと練習問題"
                )
        ));

        chapters.put(18, new Chapter(
                "付録 A 工ラ ー 解決・虎の巻",
                List.of(
                        "工ラ ー 解決・虎の巻"
                )
        ));

        chapters.put(19, new Chapter(
                "付録 B 練習問題の解答",
                List.of(
                        "練習問題の解答"
                )
        ));

        chapters.put(20, new Chapter(
                "あとがき&参考文献一覧・索引",
                List.of(
                        "あとがき&参考文献一覧・索引"
                )
        ));
    }

    /**
     * Tạo chuỗi nội dung email báo cáo công việc hàng ngày.
     *
     * @param learningTime Thời gian học (ví dụ: "6 giờ").
     * @param learnedChapterNumber Số của chương đã học.
     * @param nextChapterNumber Số của chương sắp học.
     * @param contactInfo Thông tin liên hệ (mặc định là "特になし").
     * @return Chuỗi nội dung email hoàn chỉnh.
     */
    public static String generateDailyReportContent(
            String learningTime,
            int learnedChapterNumber,
            int nextChapterNumber,
            String contactInfo) {

        Chapter learnedChapter = chapters.getOrDefault(learnedChapterNumber, new Chapter("Không tìm thấy chương đã học", List.of("Nội dung không xác định.")));
        Chapter nextChapter = chapters.getOrDefault(nextChapterNumber, new Chapter("Không tìm thấy chương sắp học", List.of("Nội dung không xác định.")));

        LocalDate currentDate = LocalDate.now();
        Locale japaneseLocale = new Locale("ja", "JP");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M月d日(E)", japaneseLocale);
        String formattedDate = currentDate.format(formatter);

        String subject = "【Daily報告 - evo2025_10】チャン・ニュ・フィン　‐　" + formattedDate;

        String body = String.format(
                "Evoltech Vietnam  藤垣さん\n" +
                        "CC　関係者各位\n\n" +
                        "いつもお世話になっております。\n\n" +
                        "IT Program　3期のフィンです。\n" +
                        "本日、「%s」の業務報告をさせていただきます。\n" +
                        "ーーーーーーーーーーーーーーーーーーーーーーーーーー\n" +
                        "学習時間：%s\n" +
                        "学習内容：\n" +
                        "%s\n" +
                        " \n%s\n\n" +
                        "ーーーーーーーーーーーーーーーーーーーーーーーーーー\n" +
                        "次回の予定：\n" +
                        "%s\n" +
                        " \n%s\n\n\n" +
                        "連絡事項：\n" +
                        "　・%s\n" +
                        "ーーーーーーーーーーーーーーーーーーーーーーーーーー\n" +
                        "お手数ですが、ご確認のほどよろしくお願いいたします。",
                formattedDate,
                learningTime,
                learnedChapter.getTitle(),
                learnedChapter.getFormattedContents(),
                nextChapter.getTitle(),
                nextChapter.getFormattedContents(),
                contactInfo
        );

        return subject + "\n\n" + body;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Tạo báo cáo hàng ngày ---");

        System.out.print("Vui lòng nhập số giờ học hôm nay: ");
        String learningTime = scanner.nextLine();

        System.out.print("Vui lòng nhập số chương đã học hôm nay: ");
        int learnedChapter = scanner.nextInt();

        System.out.print("Vui lòng nhập số chương sẽ học lần tới: ");
        int nextChapter = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Vui lòng nhập thông tin liên lạc (mặc định là '特になし'): ");
        String contactInfo = scanner.nextLine();

        if (contactInfo.trim().isEmpty()) {
            contactInfo = "特になし";
        }

        String reportContent = generateDailyReportContent(
                learningTime,
                learnedChapter,
                nextChapter,
                contactInfo
        );

        System.out.println("\n--- Nội dung gửi mail báo cáo ---\n");
        System.out.println(reportContent);

        scanner.close();
    }
}