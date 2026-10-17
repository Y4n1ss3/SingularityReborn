package androidx.compose.ui.graphics;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private final boolean isImportantForBounds;
    private ky layerBlock;

    public BlockGraphicsLayerModifier(ky kyVar) {
        this.layerBlock = kyVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Shape lastShape$ui;
        boolean lastClip$ui;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope3;
        if (ComposeUiFlags.isGraphicsLayerShapeSemanticsEnabled) {
            NodeCoordinator m6414requireCoordinator64DMado = DelegatableNodeKt.m6414requireCoordinator64DMado(this, NodeKind.m6573constructorimpl(2));
            if (m6414requireCoordinator64DMado.getWasLayerBlockInvoked$ui()) {
                lastShape$ui = m6414requireCoordinator64DMado.getLastShape$ui();
                lastClip$ui = m6414requireCoordinator64DMado.getLastClip$ui();
            } else {
                reusableGraphicsLayerScope = GraphicsLayerModifierKt.reusableGraphicsLayerScope;
                if (reusableGraphicsLayerScope == null) {
                    GraphicsLayerModifierKt.reusableGraphicsLayerScope = new ReusableGraphicsLayerScope();
                } else {
                    reusableGraphicsLayerScope2 = GraphicsLayerModifierKt.reusableGraphicsLayerScope;
                    reusableGraphicsLayerScope2.getClass();
                    reusableGraphicsLayerScope2.reset();
                }
                reusableGraphicsLayerScope3 = GraphicsLayerModifierKt.reusableGraphicsLayerScope;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setGraphicsDensity$ui(m6414requireCoordinator64DMado.getLayoutNode().getDensity());
                reusableGraphicsLayerScope3.m5089setSizeuvyYCjk(IntSizeKt.m7794toSizeozmzZPI(m6414requireCoordinator64DMado.mo6242getSizeYbymL2g()));
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    this.layerBlock.invoke(reusableGraphicsLayerScope3);
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    lastShape$ui = reusableGraphicsLayerScope3.getShape();
                    lastClip$ui = reusableGraphicsLayerScope3.getClip();
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            if (lastClip$ui) {
                SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, lastShape$ui);
            }
        }
    }

    public final ky getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        LayoutModifierNodeKt.updateLayerBlock(this, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean isImportantForBounds() {
        return this.isImportantForBounds;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new BlockGraphicsLayerModifier$measure$1(mo6234measureBRTryo0, this), 4, null);
    }

    public final void setLayerBlock(ky kyVar) {
        this.layerBlock = kyVar;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
