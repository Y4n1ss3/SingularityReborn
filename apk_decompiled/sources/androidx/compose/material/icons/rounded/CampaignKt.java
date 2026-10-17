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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CampaignKt {
    private static ImageVector _campaign;

    public static final ImageVector getCampaign(Icons.Rounded rounded) {
        ImageVector imageVector = _campaign;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Campaign", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 12.0f, 18.0f, 12.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-2.0f);
        i.curveTo(18.45f, 11.0f, 18.0f, 11.45f, 18.0f, 12.0f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.59f, 16.82f);
        b.curveToRelative(-0.33f, 0.44f, -0.24f, 1.05f, 0.2f, 1.37f);
        b.curveToRelative(0.53f, 0.39f, 1.09f, 0.81f, 1.62f, 1.21f);
        b.curveToRelative(0.44f, 0.33f, 1.06f, 0.24f, 1.38f, -0.2f);
        b.curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f);
        b.curveToRelative(0.33f, -0.44f, 0.24f, -1.06f, -0.2f, -1.38f);
        b.curveToRelative(-0.53f, -0.4f, -1.09f, -0.82f, -1.61f, -1.21f);
        b.curveToRelative(-0.44f, -0.33f, -1.06f, -0.23f, -1.39f, 0.21f);
        b.curveTo(16.6f, 16.81f, 16.59f, 16.82f, 16.59f, 16.82f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(19.81f, 4.81f);
        b2.curveToRelative(0.0f, -0.01f, -0.01f, -0.01f, -0.01f, -0.02f);
        b2.curveToRelative(-0.33f, -0.44f, -0.95f, -0.53f, -1.38f, -0.2f);
        b2.curveToRelative(-0.53f, 0.4f, -1.1f, 0.82f, -1.62f, 1.22f);
        b2.curveToRelative(-0.44f, 0.33f, -0.52f, 0.95f, -0.19f, 1.38f);
        b2.curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f);
        b2.curveToRelative(0.33f, 0.44f, 0.94f, 0.53f, 1.38f, 0.2f);
        b2.curveToRelative(0.53f, -0.39f, 1.09f, -0.82f, 1.62f, -1.22f);
        b2.curveTo(20.05f, 5.87f, 20.13f, 5.25f, 19.81f, 4.81f);
        b2.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(8.0f, 9.0f, 4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(1.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        gy.C(d, -3.0f, 1.0f, 5.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(d, 6.0f, 8.0f, 9.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(15.5f, 12.0f);
        b3.curveToRelative(0.0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f);
        b3.verticalLineToRelative(6.69f);
        b3.curveTo(14.92f, 14.53f, 15.5f, 13.33f, 15.5f, 12.0f);
        b3.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _campaign = build;
        build.getClass();
        return build;
    }
}
