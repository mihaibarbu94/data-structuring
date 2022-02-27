package src.art.artmark;

import src.art.AuctionLot;

import java.util.HashSet;
import java.util.Set;

public class ArtmarkAuctionLots {
    private static ArtmarkAuctionLots singleInstanceArtmarkAuctionLots = null;
    private Set<AuctionLot> auctionLots = new HashSet<>();

    public void updateAuctionLotsSet(final AuctionLot auctionLot) {
        auctionLots.add(auctionLot);
    }

    private ArtmarkAuctionLots() {
    }

    public static ArtmarkAuctionLots getInstance() {
        if (singleInstanceArtmarkAuctionLots == null)
            singleInstanceArtmarkAuctionLots = new ArtmarkAuctionLots();

        return singleInstanceArtmarkAuctionLots;
    }

    public Set<AuctionLot> getAuctionLots() {
        return auctionLots;
    }

    public boolean containsAuctionLot(final AuctionLot auctionLot) {
        return auctionLots.contains(auctionLot);
    }

    public int getCount() {
        return auctionLots.size();
    }
}
