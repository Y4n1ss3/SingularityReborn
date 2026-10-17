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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolAltKt {
    private static ImageVector _panToolAlt;

    public static final ImageVector getPanToolAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _panToolAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PanToolAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.2f, 15.43f);
        b.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        b.lineTo(10.0f, 15.24f);
        b.verticalLineTo(4.5f);
        b.curveTo(10.0f, 3.67f, 10.67f, 3.0f, 11.5f, 3.0f);
        b.reflectiveCurveTo(13.0f, 3.67f, 13.0f, 4.5f);
        b.verticalLineToRelative(6.0f);
        b.horizontalLineToRelative(0.91f);
        b.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        b.lineToRelative(4.09f, 2.04f);
        b.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        b.lineToRelative(-0.63f, 4.46f);
        b.curveTo(19.21f, 20.27f, 18.36f, 21.0f, 17.37f, 21.0f);
        b.horizontalLineToRelative(-6.16f);
        b.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        b.lineToRelative(-4.07f, -4.29f);
        b.curveTo(5.3f, 15.94f, 5.2f, 15.69f, 5.2f, 15.43f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panToolAlt = build;
        build.getClass();
        return build;
    }
}
