package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy implements MeasurePolicy {
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    public final AnimatedContentTransitionScopeImpl<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).maxIntrinsicWidth(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).maxIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        int i;
        Placeable placeable2;
        int width;
        int height;
        int size = list.size();
        Placeable[] placeableArr = new Placeable[size];
        long m7787getZeroYbymL2g = IntSize.Companion.m7787getZeroYbymL2g();
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            placeable = null;
            i = 1;
            if (i2 >= size2) {
                break;
            }
            Measurable measurable = list.get(i2);
            Object parentData = measurable.getParentData();
            AnimatedContentTransitionScopeImpl.ChildData childData = parentData instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) parentData : null;
            if (childData != null && childData.isTarget()) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
                long m7777constructorimpl = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
                placeableArr[i2] = mo6234measureBRTryo0;
                m7787getZeroYbymL2g = m7777constructorimpl;
            }
            i2++;
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Measurable measurable2 = list.get(i3);
            if (placeableArr[i3] == null) {
                placeableArr[i3] = measurable2.mo6234measureBRTryo0(j);
            }
        }
        if (measureScope.isLookingAhead()) {
            width = (int) (m7787getZeroYbymL2g >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int i4 = size - 1;
                if (i4 != 0) {
                    int width2 = placeable2 != null ? placeable2.getWidth() : 0;
                    if (1 <= i4) {
                        int i5 = 1;
                        while (true) {
                            Placeable placeable3 = placeableArr[i5];
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (width2 < width3) {
                                placeable2 = placeable3;
                                width2 = width3;
                            }
                            if (i5 == i4) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
            width = placeable2 != null ? placeable2.getWidth() : 0;
        }
        if (measureScope.isLookingAhead()) {
            height = (int) (m7787getZeroYbymL2g & 4294967295L);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int height2 = placeable != null ? placeable.getHeight() : 0;
                    if (1 <= i6) {
                        while (true) {
                            Placeable placeable4 = placeableArr[i];
                            int height3 = placeable4 != null ? placeable4.getHeight() : 0;
                            if (height2 < height3) {
                                placeable = placeable4;
                                height2 = height3;
                            }
                            if (i == i6) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            height = placeable != null ? placeable.getHeight() : 0;
        }
        if (!measureScope.isLookingAhead()) {
            this.rootScope.m30setMeasuredSizeozmzZPI$animation(IntSize.m7777constructorimpl((width << 32) | (height & 4294967295L)));
        }
        return MeasureScope.layout$default(measureScope, width, height, null, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, width, height), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicHeight(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicHeight(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.get(0).minIntrinsicWidth(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(list.get(i2).minIntrinsicWidth(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
