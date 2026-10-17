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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NewReleasesKt {
    private static ImageVector _newReleases;

    public static final ImageVector getNewReleases(Icons.Rounded rounded) {
        ImageVector imageVector = _newReleases;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NewReleases", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.42f, 11.34f, -1.86f, -2.12f);
        e.lineToRelative(0.26f, -2.81f);
        e.curveToRelative(0.05f, -0.5f, -0.29f, -0.96f, -0.77f, -1.07f);
        e.lineToRelative(-2.76f, -0.63f);
        e.lineToRelative(-1.44f, -2.43f);
        e.curveToRelative(-0.26f, -0.43f, -0.79f, -0.61f, -1.25f, -0.41f);
        e.lineTo(12.0f, 3.0f);
        e.lineTo(9.41f, 1.89f);
        e.curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.41f);
        e.lineTo(6.71f, 4.72f);
        e.lineToRelative(-2.75f, 0.62f);
        e.curveToRelative(-0.49f, 0.11f, -0.83f, 0.56f, -0.78f, 1.07f);
        e.lineToRelative(0.26f, 2.8f);
        e.lineToRelative(-1.86f, 2.13f);
        e.curveToRelative(-0.33f, 0.38f, -0.33f, 0.94f, 0.0f, 1.32f);
        e.lineToRelative(1.86f, 2.12f);
        e.lineToRelative(-0.26f, 2.82f);
        e.curveToRelative(-0.05f, 0.5f, 0.29f, 0.96f, 0.77f, 1.07f);
        e.lineToRelative(2.76f, 0.63f);
        e.lineToRelative(1.44f, 2.42f);
        e.curveToRelative(0.26f, 0.43f, 0.79f, 0.61f, 1.26f, 0.41f);
        e.lineTo(12.0f, 21.0f);
        e.lineToRelative(2.59f, 1.11f);
        e.curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.41f);
        e.lineToRelative(1.44f, -2.43f);
        e.lineToRelative(2.76f, -0.63f);
        e.curveToRelative(0.49f, -0.11f, 0.82f, -0.57f, 0.77f, -1.07f);
        e.lineToRelative(-0.26f, -2.81f);
        e.lineToRelative(1.86f, -2.12f);
        e.curveToRelative(0.34f, -0.36f, 0.34f, -0.92f, 0.01f, -1.3f);
        r6.B(e, 13.0f, 17.0f, -2.0f, -2.0f);
        fc.x(e, 2.0f, 2.0f, 12.0f, 13.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.lineTo(11.0f, 8.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newReleases = build;
        build.getClass();
        return build;
    }
}
