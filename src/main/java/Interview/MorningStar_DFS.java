package Interview;

import java.util.List;

interface NodeMS {
    /** Returns the child nodes, or the empty list if there are none.  Never null */
    List<NodeMS> getChildNodes();
    /** The name assigned to the node.  Never null */
    String getNodeName();
}
public class MorningStar_DFS {
    public NodeMS findNodeByName(String name, NodeMS startNode) {

        //"Scaler.Node C", nodeA
        //"Scaler.Node C", nodeB
        //"Scaler.Node C", nodeC
        // Implementation goes here
        if(startNode.getNodeName().equals(name)){
            return startNode;
        }
        List<NodeMS> list = startNode.getChildNodes();
        //B,C
        //C
        for(int i=0; i< list.size(); i++){
            return findNodeByName(name, list.get(i));
        }
        return null;
    }
}
