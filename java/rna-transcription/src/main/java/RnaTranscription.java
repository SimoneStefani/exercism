class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder(dnaStrand.length());

        for (char base: dnaStrand.toCharArray()) {
            rnaStrand.append(decode(base));
        }

        return rnaStrand.toString();
    }

    String decode(char base) {
        if (base == 'G') return "C";
        if (base == 'C') return "G";
        if (base == 'T') return "A";
        if (base == 'A') return "U";

        throw new IllegalArgumentException("Invalid input");
    }

}
