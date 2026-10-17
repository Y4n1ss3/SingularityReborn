package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovieFilterKt {
    private static ImageVector _movieFilter;

    public static final ImageVector getMovieFilter(Icons.Rounded rounded) {
        ImageVector imageVector = _movieFilter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MovieFilter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.5f, 4.0f, 18.0f, 4.0f);
        i.lineToRelative(1.74f, 2.61f);
        i.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f);
        i.lineTo(15.0f, 4.0f);
        i.horizontalLineToRelative(-2.0f);
        i.lineToRelative(1.74f, 2.61f);
        i.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(-0.33f, 0.0f, -0.65f, -0.17f, -0.83f, -0.45f);
        i.lineTo(10.0f, 4.0f);
        i.lineTo(8.0f, 4.0f);
        i.lineToRelative(1.74f, 2.61f);
        i.curveToRelative(0.11f, 0.17f, -0.01f, 0.39f, -0.21f, 0.39f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(-0.33f, 0.0f, -0.64f, -0.17f, -0.83f, -0.45f);
        i.lineTo(5.0f, 4.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.5f);
        i.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        k4.r(i, 11.25f, 15.25f, 10.0f, 18.0f);
        i.lineToRelative(-1.25f, -2.75f);
        i.lineTo(6.0f, 14.0f);
        i.lineToRelative(2.75f, -1.25f);
        i.lineTo(10.0f, 10.0f);
        i.lineToRelative(1.25f, 2.75f);
        bv.o(i, 14.0f, 14.0f, -2.75f, 1.25f);
        i.moveTo(16.94f, 11.94f);
        i.lineTo(16.0f, 14.0f);
        i.lineToRelative(-0.94f, -2.06f);
        i.lineTo(13.0f, 11.0f);
        i.lineToRelative(2.06f, -0.94f);
        i.lineTo(16.0f, 8.0f);
        i.lineToRelative(0.94f, 2.06f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 19.0f, 11.0f, -2.06f, 0.94f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _movieFilter = build;
        build.getClass();
        return build;
    }
}
