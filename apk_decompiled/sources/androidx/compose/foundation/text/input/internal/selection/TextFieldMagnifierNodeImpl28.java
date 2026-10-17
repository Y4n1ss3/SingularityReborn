package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import defpackage.ky;
import defpackage.p01;
import defpackage.q10;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final Animatable<Offset, AnimationVector2D> animatable;
    private z10 animationJob;
    private final MagnifierNode magnifierNode;
    private final MutableState magnifierSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private boolean visible;

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z;
        this.animatable = new Animatable<>(Offset.m4505boximpl(TextFieldMagnifierKt.m1393calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, m1395getMagnifierSizeYbymL2g())), SelectionMagnifierKt.getUnspecifiedSafeOffsetVectorConverter(), Offset.m4505boximpl(SelectionMagnifierKt.getOffsetDisplacementThreshold()), null, 8, null);
        final int i = 0;
        ky kyVar = new ky(this) { // from class: eu0
            public final /* synthetic */ TextFieldMagnifierNodeImpl28 e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                Offset magnifierNode$lambda$0;
                w01 magnifierNode$lambda$1;
                int i2 = i;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.e;
                switch (i2) {
                    case 0:
                        magnifierNode$lambda$0 = TextFieldMagnifierNodeImpl28.magnifierNode$lambda$0(textFieldMagnifierNodeImpl28, (Density) obj);
                        return magnifierNode$lambda$0;
                    default:
                        magnifierNode$lambda$1 = TextFieldMagnifierNodeImpl28.magnifierNode$lambda$1(textFieldMagnifierNodeImpl28, (DpSize) obj);
                        return magnifierNode$lambda$1;
                }
            }
        };
        final int i2 = 1;
        this.magnifierNode = (MagnifierNode) delegate(new MagnifierNode(kyVar, null, new ky(this) { // from class: eu0
            public final /* synthetic */ TextFieldMagnifierNodeImpl28 e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                Offset magnifierNode$lambda$0;
                w01 magnifierNode$lambda$1;
                int i22 = i2;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.e;
                switch (i22) {
                    case 0:
                        magnifierNode$lambda$0 = TextFieldMagnifierNodeImpl28.magnifierNode$lambda$0(textFieldMagnifierNodeImpl28, (Density) obj);
                        return magnifierNode$lambda$0;
                    default:
                        magnifierNode$lambda$1 = TextFieldMagnifierNodeImpl28.magnifierNode$lambda$1(textFieldMagnifierNodeImpl28, (DpSize) obj);
                        return magnifierNode$lambda$1;
                }
            }
        }, 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMagnifierSize-YbymL2g, reason: not valid java name */
    public final long m1395getMagnifierSizeYbymL2g() {
        return ((IntSize) this.magnifierSize$delegate.getValue()).m7786unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset magnifierNode$lambda$0(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, Density density) {
        return textFieldMagnifierNodeImpl28.animatable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 magnifierNode$lambda$1(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28, DpSize dpSize) {
        Density density = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.getLocalDensity());
        textFieldMagnifierNodeImpl28.m1396setMagnifierSizeozmzZPI(IntSize.m7777constructorimpl((density.mo361roundToPx0680j_4(DpSize.m7709getWidthD9Ej5fM(dpSize.m7717unboximpl())) << 32) | (density.mo361roundToPx0680j_4(DpSize.m7707getHeightD9Ej5fM(dpSize.m7717unboximpl())) & 4294967295L)));
        return w01.a;
    }

    private final void restartAnimationJob() {
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.animationJob = null;
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            this.animationJob = p01.t(getCoroutineScope(), null, null, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3);
        }
    }

    /* renamed from: setMagnifierSize-ozmzZPI, reason: not valid java name */
    private final void m1396setMagnifierSizeozmzZPI(long j) {
        this.magnifierSize$delegate.setValue(IntSize.m7774boximpl(j));
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        this.magnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimationJob();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.magnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public void update(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z2 = this.visible;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z;
        if (q10.b(transformedTextFieldState, transformedTextFieldState2) && q10.b(textFieldSelectionState, textFieldSelectionState2) && q10.b(textLayoutState, textLayoutState2) && z == z2) {
            return;
        }
        restartAnimationJob();
    }
}
