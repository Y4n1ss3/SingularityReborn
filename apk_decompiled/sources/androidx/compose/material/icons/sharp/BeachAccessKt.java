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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.Sharp sharp) {
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BeachAccess", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.95f, 5.98f);
        b.curveToRelative(-3.94f, 3.95f, -3.93f, 10.35f, 0.02f, 14.3f);
        b.lineToRelative(2.86f, -2.86f);
        b.curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f);
        k4.x(b, 17.42f, 8.83f, 2.86f, -2.86f);
        b.curveToRelative(-3.95f, -3.95f, -10.35f, -3.96f, -14.3f, -0.02f);
        b.curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f);
        k4.x(b, 5.97f, 5.96f, -0.01f, 0.01f);
        b.curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f);
        b.lineToRelative(5.73f, -5.73f);
        b.curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f);
        k4.x(b, 13.126f, 14.56f, 1.428f, -1.428f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 6.442f, 6.442f, -1.43f, 1.428f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = build;
        build.getClass();
        return build;
    }
}
