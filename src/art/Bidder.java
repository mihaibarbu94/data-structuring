package src.art;

import java.util.Set;

public class Bidder {
    final private String id;
    final private Set<Bid> bids;
    final private Set<Integer> wins;

    public Bidder(final String id, final Set<Bid> bids, final Set<Integer> wins) {
        this.id = id;
        this.bids = bids;
        this.wins = wins;
    }
}
