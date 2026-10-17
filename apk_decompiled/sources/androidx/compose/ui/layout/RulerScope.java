package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface RulerScope extends Density {
    LayoutCoordinates getCoordinates();

    void provides(Ruler ruler, float f);

    void providesRelative(VerticalRuler verticalRuler, float f);
}
