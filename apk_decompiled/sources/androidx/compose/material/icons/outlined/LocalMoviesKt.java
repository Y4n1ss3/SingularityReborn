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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalMoviesKt {
    private static ImageVector _localMovies;

    public static final ImageVector getLocalMovies(Icons.Outlined outlined) {
        ImageVector imageVector = _localMovies;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalMovies", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(14.0f, 5.0f, 14.0f, -4.0f);
        m.lineTo(10.0f, 5.0f);
        m.horizontalLineToRelative(4.0f);
        m.moveToRelative(6.0f, -2.0f);
        m.horizontalLineToRelative(-2.0f);
        uo.B(m, 2.0f, -2.0f, 16.0f, 3.0f);
        m.lineTo(8.0f, 3.0f);
        m.verticalLineToRelative(2.0f);
        m.lineTo(6.0f, 5.0f);
        m.lineTo(6.0f, 3.0f);
        af0.m(m, 4.0f, 3.0f, 18.0f, 2.0f);
        r6.D(m, -2.0f, 2.0f, 2.0f, 8.0f);
        r6.D(m, -2.0f, 2.0f, 2.0f, 2.0f);
        uo.l(m, 20.0f, 3.0f, 16.0f, 9.0f);
        fc.w(m, 16.0f, 7.0f, 2.0f, 2.0f);
        j50.t(m, -2.0f, 6.0f, 9.0f);
        fc.w(m, 6.0f, 7.0f, 2.0f, 2.0f);
        uo.l(m, 6.0f, 9.0f, 16.0f, 13.0f);
        af0.C(m, -2.0f, 2.0f, 2.0f, -2.0f);
        bv.y(m, 6.0f, 13.0f, -2.0f, 2.0f);
        kf0.t(m, 2.0f, 6.0f, 13.0f);
        bv.y(m, 16.0f, 17.0f, -2.0f, 2.0f);
        kf0.C(m, 2.0f, -2.0f, 6.0f, 17.0f);
        kf0.z(m, -2.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(m, 6.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localMovies = build;
        build.getClass();
        return build;
    }
}
