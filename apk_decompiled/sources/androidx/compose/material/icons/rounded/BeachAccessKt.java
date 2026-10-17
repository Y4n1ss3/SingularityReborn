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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.Rounded rounded) {
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BeachAccess", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.13f, 14.56f, 1.43f, -1.43f);
        e.lineToRelative(5.73f, 5.73f);
        e.curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.43f);
        e.curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.43f, 0.0f);
        fc.B(e, -5.73f, -5.73f, 17.42f, 8.83f);
        e.lineToRelative(1.27f, -1.27f);
        e.curveToRelative(0.89f, -0.89f, 0.77f, -2.43f, -0.31f, -3.08f);
        e.curveToRelative(-3.89f, -2.38f, -9.03f, -1.89f, -12.4f, 1.47f);
        e.curveToRelative(3.93f, -1.3f, 8.31f, -0.25f, 11.44f, 2.88f);
        e.close();
        e.moveTo(5.95f, 5.98f);
        e.curveToRelative(-3.36f, 3.37f, -3.85f, 8.51f, -1.48f, 12.4f);
        e.curveToRelative(0.66f, 1.08f, 2.19f, 1.21f, 3.08f, 0.31f);
        e.lineToRelative(1.27f, -1.27f);
        e.curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 5.98f);
        k4.x(e, 5.97f, 5.96f, -0.01f, 0.01f);
        e.curveToRelative(-0.38f, 3.01f, 1.17f, 6.88f, 4.3f, 10.02f);
        e.lineToRelative(5.73f, -5.73f);
        e.curveToRelative(-3.13f, -3.13f, -7.01f, -4.68f, -10.02f, -4.3f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = build;
        build.getClass();
        return build;
    }
}
