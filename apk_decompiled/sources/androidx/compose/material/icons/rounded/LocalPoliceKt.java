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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPoliceKt {
    private static ImageVector _localPolice;

    public static final ImageVector getLocalPolice(Icons.Rounded rounded) {
        ImageVector imageVector = _localPolice;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalPolice", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.5f, 12.59f, 0.63f, 2.73f);
        e.curveToRelative(0.1f, 0.43f, -0.37f, 0.77f, -0.75f, 0.54f);
        e.lineTo(12.0f, 14.42f);
        e.lineToRelative(-2.39f, 1.44f);
        e.curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f);
        e.lineTo(9.5f, 12.6f);
        e.lineToRelative(-2.1f, -1.81f);
        e.curveTo(7.06f, 10.5f, 7.24f, 9.95f, 7.68f, 9.91f);
        e.lineToRelative(2.78f, -0.24f);
        e.lineToRelative(1.08f, -2.56f);
        e.curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0.0f);
        e.lineToRelative(1.08f, 2.55f);
        e.lineToRelative(2.78f, 0.24f);
        e.curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f);
        uo.l(e, 14.5f, 12.59f, 4.19f, 4.47f);
        e.curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f);
        e.verticalLineTo(11.0f);
        e.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        e.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        e.verticalLineTo(6.3f);
        e.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        e.lineToRelative(-7.0f, -3.11f);
        e.curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 4.19f, 4.47f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPolice = build;
        build.getClass();
        return build;
    }
}
