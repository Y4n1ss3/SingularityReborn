package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.composer.GroupSourceInformation;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WriterTraceBuilder extends ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final SlotWriter writer;

    public WriterTraceBuilder(SlotWriter slotWriter) {
        this.writer = slotWriter;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public int groupKeyOf(Anchor anchor) {
        SlotWriter slotWriter = this.writer;
        return slotWriter.groupKey(slotWriter.anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public GroupSourceInformation sourceInformationOf(Anchor anchor) {
        SlotWriter slotWriter = this.writer;
        return slotWriter.sourceInformationOf$runtime(slotWriter.anchorIndex(GapAnchorKt.asGapAnchor(anchor)));
    }
}
