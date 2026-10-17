package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NewReleasesKt {
    private static ImageVector _newReleases;

    public static final ImageVector getNewReleases(Icons.Sharp sharp) {
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NewReleases", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(23.0f, 12.0f, -2.44f, -2.78f);
        e.lineToRelative(0.34f, -3.68f);
        e.lineToRelative(-3.61f, -0.82f);
        e.lineToRelative(-1.89f, -3.18f);
        e.lineTo(12.0f, 3.0f);
        e.lineTo(8.6f, 1.54f);
        e.lineTo(6.71f, 4.72f);
        e.lineToRelative(-3.61f, 0.81f);
        e.lineToRelative(0.34f, 3.68f);
        e.lineTo(1.0f, 12.0f);
        e.lineToRelative(2.44f, 2.78f);
        e.lineToRelative(-0.34f, 3.69f);
        e.lineToRelative(3.61f, 0.82f);
        e.lineToRelative(1.89f, 3.18f);
        e.lineTo(12.0f, 21.0f);
        e.lineToRelative(3.4f, 1.46f);
        e.lineToRelative(1.89f, -3.18f);
        e.lineToRelative(3.61f, -0.82f);
        gy.B(e, -0.34f, -3.68f, 23.0f, 12.0f);
        k4.C(e, 13.0f, 17.0f, -2.0f, -2.0f);
        fc.x(e, 2.0f, 2.0f, 13.0f, 13.0f);
        uo.n(e, -2.0f, 11.0f, 7.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(e, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newReleases = build;
        build.getClass();
        return build;
    }
}
