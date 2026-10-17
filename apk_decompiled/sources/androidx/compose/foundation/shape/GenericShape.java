package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ny;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final ny builder;

    public GenericShape(ny nyVar) {
        this.builder = nyVar;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m4573boximpl(j), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.builder : null) == this.builder;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
