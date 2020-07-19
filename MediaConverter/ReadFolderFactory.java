package MediaConverter;

import Readers.ReadMp4ToMp3;
import java.util.Map;

/**
 *
 * @author Perera
 */
public class ReadFolderFactory {
    public ReadFolder getInstance(Map<String, String> mediaLink){
        if(mediaLink.containsKey("mp4ToMp3Link")){
            return new ReadMp4ToMp3();
        }
        if(mediaLink.containsKey("mp4ToFlvLink")){
            return new ReadMp4ToMp3();
    }
        return null;
    
}
}
