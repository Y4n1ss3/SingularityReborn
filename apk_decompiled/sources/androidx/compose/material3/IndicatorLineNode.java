package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.hm;
import defpackage.jw;
import defpackage.p01;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndicatorLineNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private TextFieldColors _colors;
    private Shape _shape;
    private Animatable<Color, AnimationVector4D> colorAnimatable;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private boolean enabled;
    private boolean focused;
    private float focusedIndicatorWidth;
    private InteractionSource interactionSource;
    private boolean isError;
    private z10 trackFocusStateJob;
    private float unfocusedIndicatorWidth;
    private final Animatable<Dp, AnimationVector1D> widthAnimatable;

    private IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        this.enabled = z;
        this.isError = z2;
        this.interactionSource = interactionSource;
        this.focusedIndicatorWidth = f;
        this.unfocusedIndicatorWidth = f2;
        this._colors = textFieldColors;
        this._shape = shape;
        this.widthAnimatable = new Animatable<>(Dp.m7609boximpl((this.focused && z) ? f : f2), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new defpackage.h(this, 21)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawWithCacheModifierNode$lambda$3(IndicatorLineNode indicatorLineNode, CacheDrawScope cacheDrawScope) {
        float mo367toPx0680j_4 = cacheDrawScope.mo367toPx0680j_4(indicatorLineNode.widthAnimatable.getValue().m7625unboximpl());
        Path Path = AndroidPath_androidKt.Path();
        OutlineKt.addOutline(Path, indicatorLineNode.getShape().mo283createOutlinePq9zytI(cacheDrawScope.m4293getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope));
        Path Path2 = AndroidPath_androidKt.Path();
        Path.addRect$default(Path2, new Rect(0.0f, Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() & 4294967295L)) - mo367toPx0680j_4, Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() & 4294967295L))), null, 2, null);
        return cacheDrawScope.onDrawWithContent(new defpackage.g(22, Path2.and(Path), indicatorLineNode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawWithCacheModifierNode$lambda$3$lambda$2(Path path, IndicatorLineNode indicatorLineNode, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        Animatable<Color, AnimationVector4D> animatable = indicatorLineNode.colorAnimatable;
        animatable.getClass();
        DrawScope.m5324drawPathGBMwjPU$default(contentDrawScope, path, new SolidColor(animatable.getValue().m4771unboximpl(), null), 0.0f, null, null, 0, 60, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldColors getColors() {
        TextFieldColors textFieldColors = this._colors;
        return textFieldColors == null ? TextFieldDefaults.INSTANCE.defaultTextFieldColors$material3((ColorScheme) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, ColorSchemeKt.getLocalColorScheme()), (TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())) : textFieldColors;
    }

    private final Shape getShape() {
        Shape shape = this._shape;
        return shape == null ? ShapesKt.fromToken((Shapes) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, ShapesKt.getLocalShapes()), FilledTextFieldTokens.INSTANCE.getContainerShape()) : shape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateIndicator() {
        p01.t(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$1(this, null), 3);
        p01.t(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$2(this, null), 3);
    }

    private final void set_shape(Shape shape) {
        if (q10.b(this._shape, shape)) {
            return;
        }
        this._shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trackFocusState(hm hmVar) {
        this.focused = false;
        final ArrayList arrayList = new ArrayList();
        Object collect = this.interactionSource.getInteractions().collect(new jw() { // from class: androidx.compose.material3.IndicatorLineNode$trackFocusState$2
            @Override // defpackage.jw
            public final Object emit(Interaction interaction, hm hmVar2) {
                boolean z;
                if (interaction instanceof FocusInteraction.Focus) {
                    arrayList.add(interaction);
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                }
                boolean z2 = !arrayList.isEmpty();
                z = this.focused;
                if (z2 != z) {
                    this.focused = z2;
                    this.invalidateIndicator();
                }
                return w01.a;
            }
        }, hmVar);
        return collect == vn.d ? collect : w01.a;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.trackFocusStateJob = p01.t(getCoroutineScope(), null, null, new IndicatorLineNode$onAttach$1(this, null), 3);
        if (this.colorAnimatable == null) {
            long m2567indicatorColorXeAY9LY$material3 = getColors().m2567indicatorColorXeAY9LY$material3(this.enabled, this.isError, this.focused);
            this.colorAnimatable = new Animatable<>(Color.m4751boximpl(m2567indicatorColorXeAY9LY$material3), (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m4765getColorSpaceimpl(m2567indicatorColorXeAY9LY$material3)), null, null, 12, null);
        }
    }

    /* renamed from: update-gv0btCI, reason: not valid java name */
    public final void m2071updategv0btCI(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2) {
        boolean z3;
        boolean z4 = true;
        if (this.enabled != z) {
            this.enabled = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.isError != z2) {
            this.isError = z2;
            z3 = true;
        }
        if (this.interactionSource != interactionSource) {
            this.interactionSource = interactionSource;
            z10 z10Var = this.trackFocusStateJob;
            if (z10Var != null) {
                z10Var.cancel(null);
            }
            this.trackFocusStateJob = p01.t(getCoroutineScope(), null, null, new IndicatorLineNode$update$1(this, null), 3);
        }
        if (!q10.b(this._colors, textFieldColors)) {
            this._colors = textFieldColors;
            z3 = true;
        }
        if (!q10.b(this._shape, shape)) {
            set_shape(shape);
            z3 = true;
        }
        if (!Dp.m7616equalsimpl0(this.focusedIndicatorWidth, f)) {
            this.focusedIndicatorWidth = f;
            z3 = true;
        }
        if (Dp.m7616equalsimpl0(this.unfocusedIndicatorWidth, f2)) {
            z4 = z3;
        } else {
            this.unfocusedIndicatorWidth = f2;
        }
        if (z4) {
            invalidateIndicator();
        }
    }

    public /* synthetic */ IndicatorLineNode(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, dq dqVar) {
        this(z, z2, interactionSource, textFieldColors, shape, f, f2);
    }
}
