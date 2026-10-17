package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MenuBookKt {
    private static ImageVector _menuBook;

    public static final ImageVector getMenuBook(Icons.TwoTone twoTone) {
        ImageVector imageVector = _menuBook;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MenuBook", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 5.0f);
        b.curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
        b.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        b.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        b.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        b.verticalLineToRelative(14.65f);
        b.curveToRelative(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        b.curveToRelative(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
        b.curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        b.curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        b.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        b.curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        b.curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        b.curveToRelative(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
        b.verticalLineTo(6.0f);
        b.curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f);
        bv.g(b, 3.0f, 18.5f, 7.0f);
        b.curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f);
        b.curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f);
        b.verticalLineToRelative(11.5f);
        b.curveTo(9.63f, 18.41f, 7.84f, 18.0f, 6.5f, 18.0f);
        b.curveTo(5.3f, 18.0f, 4.1f, 18.15f, 3.0f, 18.5f);
        b.close();
        b.moveTo(21.0f, 18.5f);
        b.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        b.curveToRelative(-1.34f, 0.0f, -3.13f, 0.41f, -4.5f, 0.99f);
        b.verticalLineTo(7.49f);
        b.curveToRelative(1.37f, -0.59f, 3.16f, -0.99f, 4.5f, -0.99f);
        b.curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(11.0f, 7.49f);
        b2.curveTo(9.63f, 6.91f, 7.84f, 6.5f, 6.5f, 6.5f);
        b2.curveTo(5.3f, 6.5f, 4.1f, 6.65f, 3.0f, 7.0f);
        b2.verticalLineToRelative(11.5f);
        b2.curveTo(4.1f, 18.15f, 5.3f, 18.0f, 6.5f, 18.0f);
        b2.curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b2, 7.49f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b3 = uf.b(17.5f, 10.5f);
        b3.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        b3.verticalLineTo(9.24f);
        b3.curveTo(19.21f, 9.09f, 18.36f, 9.0f, 17.5f, 9.0f);
        b3.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        b3.verticalLineToRelative(1.57f);
        b3.curveTo(14.99f, 10.69f, 16.18f, 10.5f, 17.5f, 10.5f);
        b3.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw4 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk84 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b4 = uf.b(17.5f, 13.16f);
        b4.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        b4.verticalLineTo(11.9f);
        b4.curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        b4.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        b4.verticalLineToRelative(1.57f);
        b4.curveTo(14.99f, 13.36f, 16.18f, 13.16f, 17.5f, 13.16f);
        b4.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw4, m5145getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw5 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk85 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b5 = uf.b(17.5f, 15.83f);
        b5.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        b5.verticalLineToRelative(-1.52f);
        b5.curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        b5.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        b5.verticalLineToRelative(1.57f);
        b5.curveTo(14.99f, 16.02f, 16.18f, 15.83f, 17.5f, 15.83f);
        b5.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw5, m5145getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menuBook = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMenuBook$annotations(Icons.TwoTone twoTone) {
    }
}
