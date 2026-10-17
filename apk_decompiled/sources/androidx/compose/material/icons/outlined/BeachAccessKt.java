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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.Outlined outlined) {
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BeachAccess", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 19.57f, -1.427f, 1.428f);
        fc.C(e, -6.442f, -6.442f, 1.43f, -1.428f);
        e.moveTo(13.12f, 3.0f);
        e.curveToRelative(-2.58f, 0.0f, -5.16f, 0.98f, -7.14f, 2.95f);
        e.lineToRelative(-0.01f, 0.01f);
        e.curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0.0f, 14.31f);
        e.lineToRelative(14.3f, -14.31f);
        e.curveTo(18.3f, 3.99f, 15.71f, 3.0f, 13.12f, 3.0f);
        e.close();
        e.moveTo(6.14f, 17.27f);
        e.curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f);
        e.curveToRelative(0.0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f);
        e.curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f);
        fc.B(e, -1.39f, 1.38f, 8.98f, 14.43f);
        e.curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f);
        e.curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f);
        e.curveToRelative(1.8f, 0.0f, 3.55f, 0.55f, 5.08f, 1.56f);
        fc.B(e, -5.45f, 5.45f, 10.45f, 5.46f);
        e.curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f);
        e.curveToRelative(1.49f, 0.0f, 2.91f, 0.4f, 4.15f, 1.14f);
        e.lineToRelative(-1.39f, 1.39f);
        e.curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = build;
        build.getClass();
        return build;
    }
}
