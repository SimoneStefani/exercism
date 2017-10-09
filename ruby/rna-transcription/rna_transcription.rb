module Complement

    @@conversion = { "G"=>"C", "A"=>"U", "T"=>"A", "C"=>"G" }

    def self.of_dna(dna_strand)
        begin
            return dna_strand.chars.inject('') { |rna, d| rna + @@conversion[d] }
        rescue(TypeError)
            return ''
        end
    end

end

module BookKeeping
    VERSION = 4
end