package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.ac;
import defpackage.cj;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.p01;
import defpackage.q10;
import defpackage.ql0;
import defpackage.sl0;
import defpackage.un;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private final List<LazyLayoutItemAnimation> disappearingItems;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final fb0 keyToItemInfoMap;
    private final Modifier modifier;
    private final gb0 movingAwayKeys;
    private final List<T> movingAwayToEndBound;
    private final List<T> movingAwayToStartBound;
    private final List<T> movingInFromEndBound;
    private final List<T> movingInFromStartBound;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsNode(lazyLayoutItemAnimator);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float m7739getXimpl = IntOffset.m7739getXimpl(lazyLayoutItemAnimation.m915getFinalOffsetnOccac());
                    float m7739getXimpl2 = m7739getXimpl - IntOffset.m7739getXimpl(layer.m5428getTopLeftnOccac());
                    float m7740getYimpl = IntOffset.m7740getYimpl(lazyLayoutItemAnimation.m915getFinalOffsetnOccac()) - IntOffset.m7740getYimpl(layer.m5428getTopLeftnOccac());
                    contentDrawScope.getDrawContext().getTransform().translate(m7739getXimpl2, m7740getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-m7739getXimpl2, -m7740getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsNode) && q10.b(this.animator, ((DisplayingDisappearingItemsNode) obj).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            if (q10.b(this.animator, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode = this;
            this.animator = lazyLayoutItemAnimator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class ItemInfo {
        private LazyLayoutItemAnimation[] animations;
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private int span;

        public ItemInfo() {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            lazyLayoutItemAnimationArr = LazyLayoutItemAnimatorKt.EmptyArray;
            this.animations = lazyLayoutItemAnimationArr;
            this.span = 1;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.isRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, un unVar, GraphicsContext graphicsContext, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, unVar, graphicsContext, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 updateAnimation$lambda$0$0(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            DrawModifierNode drawModifierNode = lazyLayoutItemAnimator.displayingNode;
            if (drawModifierNode != null) {
                DrawModifierNodeKt.invalidateDraw(drawModifierNode);
            }
            return w01.a;
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name */
        public final Constraints m924getConstraintsDWUhwKw() {
            return this.constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final int getLane() {
            return this.lane;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getSpan() {
            return this.span;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m925setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i) {
            this.crossAxisOffset = i;
        }

        public final void setLane(int i) {
            this.lane = i;
        }

        public final void setSpan(int i) {
            this.span = i;
        }

        public final void updateAnimation(T t, un unVar, GraphicsContext graphicsContext, int i, int i2, int i3) {
            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
            LazyLayoutAnimationSpecsNode specs;
            if (!isRunningPlacement()) {
                this.layoutMinOffset = i;
                this.layoutMaxOffset = i2;
            }
            int placeablesCount = t.getPlaceablesCount();
            int length = this.animations.length;
            while (true) {
                lazyLayoutItemAnimationArr = this.animations;
                if (placeablesCount >= length) {
                    break;
                }
                LazyLayoutItemAnimation lazyLayoutItemAnimation = lazyLayoutItemAnimationArr[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
                placeablesCount++;
            }
            if (lazyLayoutItemAnimationArr.length != t.getPlaceablesCount()) {
                this.animations = (LazyLayoutItemAnimation[]) Arrays.copyOf(this.animations, t.getPlaceablesCount());
            }
            this.constraints = Constraints.m7551boximpl(t.mo870getConstraintsmsEJaDk());
            this.crossAxisOffset = i3;
            this.lane = t.getLane();
            this.span = t.getSpan();
            int placeablesCount2 = t.getPlaceablesCount();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i4 = 0; i4 < placeablesCount2; i4++) {
                specs = LazyLayoutItemAnimatorKt.getSpecs(t.getParentData(i4));
                LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = this.animations;
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = lazyLayoutItemAnimationArr2[i4];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i4] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = lazyLayoutItemAnimationArr2[i4];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(unVar, graphicsContext, new f(lazyLayoutItemAnimator, 3));
                        this.animations[i4] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = ql0.a;
        this.keyToItemInfoMap = new fb0();
        gb0 gb0Var = sl0.a;
        this.movingAwayKeys = new gb0();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
        this.disappearingItems = new ArrayList();
        this.modifier = new DisplayingDisappearingItemsElement(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo871getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo871getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.isVertical() ? IntOffset.m7740getYimpl(mo871getOffsetBjo55l4) : IntOffset.m7739getXimpl(mo871getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t) {
        LazyLayoutAnimationSpecsNode specs;
        int placeablesCount = t.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            specs = LazyLayoutItemAnimatorKt.getSpecs(t.getParentData(i));
            if (specs != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo871getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo871getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.isVertical() ? IntOffset.m7740getYimpl(mo871getOffsetBjo55l4) : IntOffset.m7739getXimpl(mo871getOffsetBjo55l4);
    }

    private final void initializeAnimation(T t, int i, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i2 = 0;
        long mo871getOffsetBjo55l4 = t.mo871getOffsetBjo55l4(0);
        long m7735copyiSbpLlY$default = t.isVertical() ? IntOffset.m7735copyiSbpLlY$default(mo871getOffsetBjo55l4, 0, i, 1, null) : IntOffset.m7735copyiSbpLlY$default(mo871getOffsetBjo55l4, i, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m921setRawOffsetgyyYBs(IntOffset.m7743plusqkQi6aY(m7735copyiSbpLlY$default, IntOffset.m7742minusqkQi6aY(t.mo871getOffsetBjo55l4(i3), mo871getOffsetBjo55l4)));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            Object d = lazyLayoutItemAnimator.keyToItemInfoMap.d(lazyLayoutMeasuredItem.getKey());
            d.getClass();
            itemInfo = (ItemInfo) d;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i, itemInfo);
    }

    private final void releaseAnimations() {
        fb0 fb0Var = this.keyToItemInfoMap;
        if (fb0Var.e != 0) {
            Object[] objArr = fb0Var.c;
            long[] jArr = fb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i << 3) + i3]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.keyToItemInfoMap.f();
        }
    }

    private final void removeInfoForKey(Object obj) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.j(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T t, boolean z) {
        Object d = this.keyToItemInfoMap.d(t.getKey());
        d.getClass();
        LazyLayoutItemAnimation[] animations = ((ItemInfo) d).getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                long mo871getOffsetBjo55l4 = t.mo871getOffsetBjo55l4(i2);
                long m918getRawOffsetnOccac = lazyLayoutItemAnimation.m918getRawOffsetnOccac();
                if (!IntOffset.m7738equalsimpl0(m918getRawOffsetnOccac, LazyLayoutItemAnimation.Companion.m922getNotInitializednOccac()) && !IntOffset.m7738equalsimpl0(m918getRawOffsetnOccac, mo871getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m914animatePlacementDeltaar5cAso(IntOffset.m7742minusqkQi6aY(mo871getOffsetBjo55l4, m918getRawOffsetnOccac), z);
                }
                lazyLayoutItemAnimation.m921setRawOffsetgyyYBs(mo871getOffsetBjo55l4);
            }
            i++;
            i2 = i3;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z);
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan() + lane;
        int i = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = t.getMainAxisSizeWithSpacings() + iArr[lane];
            iArr[lane] = mainAxisSizeWithSpacings;
            i = Math.max(i, mainAxisSizeWithSpacings);
            lane++;
        }
        return i;
    }

    public final LazyLayoutItemAnimation getAnimation(Object obj, int i) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.d(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m923getMinSizeToFitDisappearingItemsYbymL2g() {
        long m7787getZeroYbymL2g = IntSize.Companion.m7787getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                m7787getZeroYbymL2g = IntSize.m7777constructorimpl((Math.max((int) (m7787getZeroYbymL2g & 4294967295L), IntOffset.m7740getYimpl(lazyLayoutItemAnimation.m918getRawOffsetnOccac()) + ((int) (layer.m5426getSizeYbymL2g() & 4294967295L))) & 4294967295L) | (Math.max((int) (m7787getZeroYbymL2g >> 32), IntOffset.m7739getXimpl(lazyLayoutItemAnimation.m918getRawOffsetnOccac()) + ((int) (layer.m5426getSizeYbymL2g() >> 32))) << 32));
            }
        }
        return m7787getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int i, int i2, int i3, List<T> list, final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap, LazyLayoutMeasuredItemProvider<T> lazyLayoutMeasuredItemProvider, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, un unVar, GraphicsContext graphicsContext) {
        int i7;
        int i8;
        int i9;
        Object[] objArr;
        long[] jArr;
        int i10;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long[] jArr3;
        long[] jArr4;
        int i17;
        int i18 = i4;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = this.keyIndexMap;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
        int size = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                if (this.keyToItemInfoMap.e()) {
                    releaseAnimations();
                    return;
                }
            } else if (getHasAnimations(list.get(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int i20 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) yi.q0(list);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long m7733constructorimpl = z ? IntOffset.m7733constructorimpl(i & 4294967295L) : IntOffset.m7733constructorimpl(i << 32);
        boolean z4 = z2 || !z3;
        fb0 fb0Var = this.keyToItemInfoMap;
        Object[] objArr3 = fb0Var.b;
        long[] jArr5 = fb0Var.a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i21 = 0;
            while (true) {
                long j = jArr5[i21];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j & 255) < 128) {
                            jArr4 = jArr5;
                            i17 = i23;
                            this.movingAwayKeys.d(objArr3[(i21 << 3) + i23]);
                        } else {
                            jArr4 = jArr5;
                            i17 = i23;
                        }
                        j >>= 8;
                        i23 = i17 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i22 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                jArr5 = jArr3;
            }
        }
        int size2 = list.size();
        int i24 = 0;
        while (i24 < size2) {
            T t = list.get(i24);
            this.movingAwayKeys.m(t.getKey());
            if (getHasAnimations(t)) {
                ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.d(t.getKey());
                int index = lazyLayoutKeyIndexMap2 != null ? lazyLayoutKeyIndexMap2.getIndex(t.getKey()) : -1;
                boolean z5 = index == -1 && lazyLayoutKeyIndexMap2 != null;
                if (itemInfo == null) {
                    ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t, unVar, graphicsContext, i5, i6, 0, 32, null);
                    i12 = size2;
                    this.keyToItemInfoMap.l(t.getKey(), itemInfo2);
                    if (t.getIndex() == index || index == -1) {
                        long mo871getOffsetBjo55l4 = t.mo871getOffsetBjo55l4(0);
                        initializeAnimation(t, t.isVertical() ? IntOffset.m7740getYimpl(mo871getOffsetBjo55l4) : IntOffset.m7739getXimpl(mo871getOffsetBjo55l4), itemInfo2);
                        if (z5) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                }
                            }
                        }
                    } else if (index < i20) {
                        this.movingInFromStartBound.add(t);
                    } else {
                        this.movingInFromEndBound.add(t);
                    }
                } else {
                    i12 = size2;
                    if (z4) {
                        ItemInfo.updateAnimation$default(itemInfo, t, unVar, graphicsContext, i5, i6, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i25 = 0;
                        while (i25 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i25];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i26 = i20;
                            if (lazyLayoutItemAnimation2 != null) {
                                i15 = i24;
                                i16 = length2;
                                if (!IntOffset.m7738equalsimpl0(lazyLayoutItemAnimation2.m918getRawOffsetnOccac(), LazyLayoutItemAnimation.Companion.m922getNotInitializednOccac())) {
                                    lazyLayoutItemAnimation2.m921setRawOffsetgyyYBs(IntOffset.m7743plusqkQi6aY(lazyLayoutItemAnimation2.m918getRawOffsetnOccac(), m7733constructorimpl));
                                }
                            } else {
                                i15 = i24;
                                i16 = length2;
                            }
                            i25++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i20 = i26;
                            i24 = i15;
                            length2 = i16;
                        }
                        i13 = i20;
                        i14 = i24;
                        if (z5) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                        }
                                    }
                                    lazyLayoutItemAnimation3.animateAppearance();
                                }
                            }
                        }
                        startPlacementAnimationsIfNeeded$default(this, t, false, 2, null);
                    }
                }
                i13 = i20;
                i14 = i24;
            } else {
                i12 = size2;
                i13 = i20;
                i14 = i24;
                removeInfoForKey(t.getKey());
            }
            i24 = i14 + 1;
            i20 = i13;
            size2 = i12;
        }
        int i27 = 2;
        int[] iArr = new int[i18];
        if (!z4 || lazyLayoutKeyIndexMap2 == null) {
            i7 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i7 = 2;
            } else {
                List<T> list2 = this.movingInFromStartBound;
                if (list2.size() > 1) {
                    cj.b0(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            return p01.i(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t2).getKey())));
                        }
                    });
                }
                List<T> list3 = this.movingInFromStartBound;
                int size3 = list3.size();
                int i28 = 0;
                while (i28 < size3) {
                    T t2 = list3.get(i28);
                    int i29 = i27;
                    initializeAnimation$default(this, t2, i5 - updateAndReturnOffsetFor(iArr, t2), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t2, false, i29, null);
                    i28++;
                    i27 = i29;
                }
                i7 = i27;
                ac.Y(iArr, 0, 0, 6);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list4 = this.movingInFromEndBound;
                if (list4.size() > 1) {
                    cj.b0(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t3, T t4) {
                            return p01.i(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                        }
                    });
                }
                List<T> list5 = this.movingInFromEndBound;
                int size4 = list5.size();
                for (int i30 = 0; i30 < size4; i30++) {
                    T t3 = list5.get(i30);
                    initializeAnimation$default(this, t3, (i6 + updateAndReturnOffsetFor(iArr, t3)) - t3.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t3, false, i7, null);
                }
                ac.Y(iArr, 0, 0, 6);
            }
        }
        gb0 gb0Var = this.movingAwayKeys;
        Object[] objArr4 = gb0Var.b;
        long[] jArr6 = gb0Var.a;
        int length3 = jArr6.length - i7;
        if (length3 >= 0) {
            int i31 = 0;
            while (true) {
                long j2 = jArr6[i31];
                long[] jArr7 = jArr6;
                Object[] objArr5 = objArr4;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i32 = 8 - ((~(i31 - length3)) >>> 31);
                    int i33 = 0;
                    while (i33 < i32) {
                        if ((j2 & 255) < 128) {
                            Object obj = objArr5[(i31 << 3) + i33];
                            i10 = i33;
                            ItemInfo itemInfo3 = (ItemInfo) this.keyToItemInfoMap.d(obj);
                            if (itemInfo3 != null) {
                                objArr2 = objArr5;
                                int index2 = lazyLayoutKeyIndexMap.getIndex(obj);
                                jArr2 = jArr7;
                                itemInfo3.setSpan(Math.min(i18, itemInfo3.getSpan()));
                                itemInfo3.setLane(Math.min(i18 - itemInfo3.getSpan(), itemInfo3.getLane()));
                                if (index2 == -1) {
                                    LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                    int length4 = animations3.length;
                                    int i34 = 0;
                                    boolean z6 = false;
                                    int i35 = 0;
                                    while (i34 < length4) {
                                        ItemInfo itemInfo4 = itemInfo3;
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i34];
                                        int i36 = i35 + 1;
                                        if (lazyLayoutItemAnimation4 != null) {
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                lazyLayoutItemAnimationArr = animations3;
                                            } else if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo4.getAnimations()[i35] = null;
                                                lazyLayoutItemAnimationArr = animations3;
                                                this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode2 = this.displayingNode;
                                                if (drawModifierNode2 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                                }
                                            } else {
                                                lazyLayoutItemAnimationArr = animations3;
                                                if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                    lazyLayoutItemAnimation4.animateDisappearance();
                                                }
                                                if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                    this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                    DrawModifierNode drawModifierNode3 = this.displayingNode;
                                                    if (drawModifierNode3 != null) {
                                                        DrawModifierNodeKt.invalidateDraw(drawModifierNode3);
                                                    }
                                                } else {
                                                    lazyLayoutItemAnimation4.release();
                                                    itemInfo4.getAnimations()[i35] = null;
                                                    i34++;
                                                    i35 = i36;
                                                    animations3 = lazyLayoutItemAnimationArr;
                                                    itemInfo3 = itemInfo4;
                                                }
                                            }
                                            z6 = true;
                                            i34++;
                                            i35 = i36;
                                            animations3 = lazyLayoutItemAnimationArr;
                                            itemInfo3 = itemInfo4;
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                        }
                                        i34++;
                                        i35 = i36;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        itemInfo3 = itemInfo4;
                                    }
                                    if (!z6) {
                                        removeInfoForKey(obj);
                                    }
                                } else {
                                    Constraints m924getConstraintsDWUhwKw = itemInfo3.m924getConstraintsDWUhwKw();
                                    m924getConstraintsDWUhwKw.getClass();
                                    T mo873getAndMeasurehBUhpc = lazyLayoutMeasuredItemProvider.mo873getAndMeasurehBUhpc(index2, itemInfo3.getLane(), itemInfo3.getSpan(), m924getConstraintsDWUhwKw.m7570unboximpl());
                                    mo873getAndMeasurehBUhpc.setNonScrollableItem(true);
                                    LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                    int length5 = animations4.length;
                                    int i37 = 0;
                                    while (true) {
                                        if (i37 < length5) {
                                            LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i37];
                                            int i38 = i37;
                                            if (lazyLayoutItemAnimation5 != null) {
                                                boolean isPlacementAnimationInProgress = lazyLayoutItemAnimation5.isPlacementAnimationInProgress();
                                                i11 = length5;
                                                if (isPlacementAnimationInProgress) {
                                                    break;
                                                }
                                            } else {
                                                i11 = length5;
                                            }
                                            i37 = i38 + 1;
                                            length5 = i11;
                                        } else if (lazyLayoutKeyIndexMap2 != null && index2 == lazyLayoutKeyIndexMap2.getIndex(obj)) {
                                            removeInfoForKey(obj);
                                        }
                                    }
                                    itemInfo3.updateAnimation(mo873getAndMeasurehBUhpc, unVar, graphicsContext, i5, i6, itemInfo3.getCrossAxisOffset());
                                    if (index2 < this.firstVisibleIndex) {
                                        this.movingAwayToStartBound.add(mo873getAndMeasurehBUhpc);
                                    } else {
                                        this.movingAwayToEndBound.add(mo873getAndMeasurehBUhpc);
                                    }
                                }
                                j2 >>= 8;
                                i18 = i4;
                                i33 = i10 + 1;
                                objArr5 = objArr2;
                                jArr7 = jArr2;
                            }
                        } else {
                            i10 = i33;
                        }
                        objArr2 = objArr5;
                        jArr2 = jArr7;
                        j2 >>= 8;
                        i18 = i4;
                        i33 = i10 + 1;
                        objArr5 = objArr2;
                        jArr7 = jArr2;
                    }
                    objArr = objArr5;
                    jArr = jArr7;
                    if (i32 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    jArr = jArr7;
                }
                if (i31 == length3) {
                    break;
                }
                i31++;
                i18 = i4;
                objArr4 = objArr;
                jArr6 = jArr;
            }
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i8 = i2;
            i9 = i3;
        } else {
            List<T> list6 = this.movingAwayToStartBound;
            if (list6.size() > 1) {
                cj.b0(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        return p01.i(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                    }
                });
            }
            List<T> list7 = this.movingAwayToStartBound;
            int size5 = list7.size();
            for (int i39 = 0; i39 < size5; i39++) {
                T t4 = list7.get(i39);
                Object d = this.keyToItemInfoMap.d(t4.getKey());
                d.getClass();
                ItemInfo itemInfo5 = (ItemInfo) d;
                t4.position((z2 ? getMainAxisOffset((LazyLayoutMeasuredItem) yi.p0(list)) : itemInfo5.getLayoutMinOffset()) - updateAndReturnOffsetFor(iArr, t4), itemInfo5.getCrossAxisOffset(), i2, i3);
                if (z4) {
                    startPlacementAnimationsIfNeeded(t4, true);
                }
            }
            i8 = i2;
            i9 = i3;
            ac.Y(iArr, 0, 0, 6);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list8 = this.movingAwayToEndBound;
            if (list8.size() > 1) {
                cj.b0(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        return p01.i(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyLayoutMeasuredItem) t6).getKey())));
                    }
                });
            }
            List<T> list9 = this.movingAwayToEndBound;
            int size6 = list9.size();
            for (int i40 = 0; i40 < size6; i40++) {
                T t5 = list9.get(i40);
                Object d2 = this.keyToItemInfoMap.d(t5.getKey());
                d2.getClass();
                ItemInfo itemInfo6 = (ItemInfo) d2;
                t5.position((itemInfo6.getLayoutMaxOffset() - t5.getMainAxisSizeWithSpacings()) + updateAndReturnOffsetFor(iArr, t5), itemInfo6.getCrossAxisOffset(), i8, i9);
                if (z4) {
                    startPlacementAnimationsIfNeeded(t5, true);
                }
            }
        }
        List<T> list10 = this.movingAwayToStartBound;
        list10.getClass();
        Collections.reverse(list10);
        list.addAll(0, list10);
        list.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.f();
    }

    public final void reset() {
        releaseAnimations();
        this.keyIndexMap = null;
        this.firstVisibleIndex = -1;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            return new DisplayingDisappearingItemsElement(lazyLayoutItemAnimator);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public DisplayingDisappearingItemsNode create() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && q10.b(this.animator, ((DisplayingDisappearingItemsElement) obj).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode displayingDisappearingItemsNode) {
            displayingDisappearingItemsNode.setAnimator(this.animator);
        }
    }
}
