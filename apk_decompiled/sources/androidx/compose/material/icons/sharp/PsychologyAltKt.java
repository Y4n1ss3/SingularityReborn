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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PsychologyAltKt {
    private static ImageVector _psychologyAlt;

    public static final ImageVector getPsychologyAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _psychologyAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PsychologyAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.94f, 9.06f);
        b.curveTo(19.5f, 5.73f, 16.57f, 3.0f, 13.0f, 3.0f);
        b.curveTo(9.47f, 3.0f, 6.57f, 5.61f, 6.08f, 9.0f);
        b.lineToRelative(-1.93f, 3.48f);
        b.curveTo(3.74f, 13.14f, 4.22f, 14.0f, 5.0f, 14.0f);
        kf0.B(b, 1.0f, 0.0f, 4.0f, 3.0f);
        gy.C(b, 3.0f, 7.0f, 0.0f, -4.68f);
        b.curveTo(18.62f, 15.07f, 20.35f, 12.24f, 19.94f, 9.06f);
        b.close();
        b.moveTo(12.5f, 14.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.74f, -0.33f, -0.74f, -0.74f);
        b.curveToRelative(0.0f, -0.41f, 0.33f, -0.73f, 0.74f, -0.73f);
        b.curveToRelative(0.41f, 0.0f, 0.73f, 0.32f, 0.73f, 0.73f);
        b.curveTo(13.23f, 13.67f, 12.92f, 14.0f, 12.5f, 14.0f);
        b.close();
        b.moveTo(14.26f, 9.68f);
        b.curveToRelative(-0.44f, 0.65f, -0.86f, 0.85f, -1.09f, 1.27f);
        b.curveToRelative(-0.09f, 0.17f, -0.13f, 0.28f, -0.13f, 0.82f);
        b.horizontalLineToRelative(-1.06f);
        b.curveToRelative(0.0f, -0.29f, -0.04f, -0.75f, 0.18f, -1.16f);
        b.curveToRelative(0.28f, -0.51f, 0.83f, -0.81f, 1.14f, -1.26f);
        b.curveToRelative(0.33f, -0.47f, 0.15f, -1.36f, -0.8f, -1.36f);
        b.curveToRelative(-0.62f, 0.0f, -0.92f, 0.47f, -1.05f, 0.86f);
        b.lineToRelative(-0.96f, -0.4f);
        b.curveTo(10.76f, 7.67f, 11.46f, 7.0f, 12.5f, 7.0f);
        b.curveToRelative(0.86f, 0.0f, 1.45f, 0.39f, 1.75f, 0.88f);
        b.curveTo(14.51f, 8.31f, 14.66f, 9.1f, 14.26f, 9.68f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _psychologyAlt = build;
        build.getClass();
        return build;
    }
}
