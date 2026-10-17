package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.composer.GroupSourceInformation;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilder;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditorTraceBuilder extends ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final SlotTableEditor editor;

    public EditorTraceBuilder(SlotTableEditor slotTableEditor) {
        this.editor = slotTableEditor;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public int groupKeyOf(Anchor anchor) {
        return this.editor.groupKey(LinkAnchorKt.asLinkAnchor(anchor).getAddress());
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public GroupSourceInformation sourceInformationOf(Anchor anchor) {
        return this.editor.getTable().getAddressSpace().sourceInformationOf(LinkAnchorKt.asLinkAnchor(anchor).getAddress());
    }
}
