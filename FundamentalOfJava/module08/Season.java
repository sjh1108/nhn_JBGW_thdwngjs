public enum Season {
    Spring("봄"),
    Summer("여름"),
    Fall("가을"),
    Winter("겨울");

    private String korName;

    private Season() {}
    private Season(String korName) {
        this.korName = korName;
    }

    public String getKorName() {
        return this.korName;
    }
}