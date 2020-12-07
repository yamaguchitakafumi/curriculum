/**
 * Task1_1: 課題内容
 *
 * 本課題では、データ型・文字列の使い方を学んでいきましょう。
 * 問①から問⑧まであります。
 * 指定された型・値・変数名を守って記述してください。
 * 問③,⑦については、コメントを入れてください。
 *
 */
public class Task1_1 {
    public static void main(String[] args) {
        int hogeInt = 50;
        String hogeString = "テスト";
        // ①int型の hogeInt という名前の変数を宣言し、値「50」で初期化
        // ②Stringクラスの hogeString という名前の変数を宣言、値「テスト」で初期化
        // ③下記の処理について、何をしているのかコメントを記入してください
        // [int型のhogeIntという変数に50の値が代入された。文字列クラスStringのhogeStringにテストという文字列が入った。]
        double hogeDouble = 0.2;
        hogeInt = 100;
        hogeString = "合格";
        System.out.println(hogeInt);
        System.out.println(hogeDouble);
        // ④変数 hogeInt を値「100」で上書き
        // ⑤変数 hogeString を値「合格」で上書き
        // ⑥変数 hogeInt の値を表示
        // ⑦下記の処理について、何をしているのかコメントを記入してください
        // [hogeStringにて定義されている値を表示する。]
        System.out.println(hogeString);
        // ⑧変数 hogeDouble の値を表示
    }
}