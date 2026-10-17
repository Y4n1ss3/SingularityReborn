package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.er;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    List<Measurable> compose(int i);

    @er
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo928measure0kLqBqw(int i, long j);
}
