package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovieFilterKt {
    private static ImageVector _movieFilter;

    public static final ImageVector getMovieFilter(Icons.Outlined outlined) {
        ImageVector imageVector = _movieFilter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MovieFilter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.0f, 11.0f, -0.94f, 2.06f);
        e.lineTo(7.0f, 14.0f);
        e.lineToRelative(2.06f, 0.94f);
        e.lineTo(10.0f, 17.0f);
        e.lineToRelative(0.94f, -2.06f);
        bv.o(e, 13.0f, 14.0f, -2.06f, -0.94f);
        e.moveTo(18.01f, 4.0f);
        e.lineToRelative(2.0f, 4.0f);
        kf0.B(e, -3.0f, -2.0f, -4.0f, -2.0f);
        e.lineToRelative(2.0f, 4.0f);
        kf0.B(e, -3.0f, -2.0f, -4.0f, -2.0f);
        e.lineToRelative(2.0f, 4.0f);
        kf0.B(e, -3.0f, -2.0f, -4.0f, -1.0f);
        e.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        e.lineToRelative(-0.01f, 12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        uf.j(e, 22.0f, 4.0f, -3.99f);
        e.moveTo(20.01f, 18.0f);
        e.horizontalLineToRelative(-16.0f);
        e.lineTo(4.01f, 6.47f);
        e.lineTo(5.77f, 10.0f);
        e.lineTo(16.0f, 10.0f);
        e.lineToRelative(-0.63f, 1.37f);
        e.lineTo(14.0f, 12.0f);
        e.lineToRelative(1.37f, 0.63f);
        e.lineTo(16.0f, 14.0f);
        e.lineToRelative(0.63f, -1.37f);
        e.lineTo(18.0f, 12.0f);
        e.lineToRelative(-1.37f, -0.63f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 16.0f, 10.0f, 4.01f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movieFilter = build;
        build.getClass();
        return build;
    }
}
