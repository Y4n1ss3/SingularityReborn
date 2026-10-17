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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InventoryKt {
    private static ImageVector _inventory;

    public static final ImageVector getInventory(Icons.Rounded rounded) {
        ImageVector imageVector = _inventory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Inventory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(5.0f, 5.0f, 2.0f, 1.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        uf.p(b, 5.0f, 2.0f, 5.0f, 2.0f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.18f);
        b.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        b.verticalLineToRelative(14.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(b, 6.0f, -2.0f, 5.0f, 5.0f);
        b.moveTo(12.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 11.45f, 3.0f, 12.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(21.75f, 12.25f);
        b2.curveToRelative(-0.41f, -0.41f, -1.09f, -0.41f, -1.5f, 0.0f);
        b2.lineTo(15.51f, 17.0f);
        b2.lineToRelative(-2.26f, -2.25f);
        b2.curveToRelative(-0.41f, -0.41f, -1.08f, -0.41f, -1.5f, 0.0f);
        b2.lineToRelative(0.0f, 0.0f);
        b2.curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f);
        b2.lineToRelative(3.05f, 3.04f);
        b2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b2.lineToRelative(5.53f, -5.54f);
        b2.curveTo(22.16f, 13.34f, 22.16f, 12.66f, 21.75f, 12.25f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _inventory = build;
        build.getClass();
        return build;
    }
}
