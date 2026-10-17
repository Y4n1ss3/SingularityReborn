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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EcoKt {
    private static ImageVector _eco;

    public static final ImageVector getEco(Icons.Outlined outlined) {
        ImageVector imageVector = _eco;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Eco", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.05f, 8.05f);
        b.curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.0f, 9.9f);
        b.curveTo(7.42f, 19.32f, 9.21f, 20.0f, 11.0f, 20.0f);
        b.reflectiveCurveToRelative(3.58f, -0.68f, 4.95f, -2.05f);
        b.curveTo(19.43f, 14.47f, 20.0f, 4.0f, 20.0f, 4.0f);
        b.reflectiveCurveTo(9.53f, 4.57f, 6.05f, 8.05f);
        b.close();
        b.moveTo(14.54f, 16.54f);
        b.curveTo(13.59f, 17.48f, 12.34f, 18.0f, 11.0f, 18.0f);
        b.curveToRelative(-0.89f, 0.0f, -1.73f, -0.25f, -2.48f, -0.68f);
        b.curveToRelative(0.92f, -2.88f, 2.62f, -5.41f, 4.88f, -7.32f);
        b.curveToRelative(-2.63f, 1.36f, -4.84f, 3.46f, -6.37f, 6.0f);
        b.curveToRelative(-1.48f, -1.96f, -1.35f, -4.75f, 0.44f, -6.54f);
        b.curveTo(9.21f, 7.72f, 14.04f, 6.65f, 17.8f, 6.2f);
        b.curveTo(17.35f, 9.96f, 16.28f, 14.79f, 14.54f, 16.54f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eco = build;
        build.getClass();
        return build;
    }
}
