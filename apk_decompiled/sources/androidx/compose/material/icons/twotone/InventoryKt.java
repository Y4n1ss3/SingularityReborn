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
import defpackage.af0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InventoryKt {
    private static ImageVector _inventory;

    public static final ImageVector getInventory(Icons.TwoTone twoTone) {
        ImageVector imageVector = _inventory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Inventory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.0f, 11.5f, 1.5f, 1.5f);
        e.lineToRelative(-6.99f, 7.0f);
        e.lineTo(11.0f, 15.5f);
        e.lineToRelative(1.5f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 3.01f, 3.0f, 21.0f, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(17.0f, 5.0f, 0.0f, 3.0f);
        e2.lineToRelative(-10.0f, 0.0f);
        e2.lineToRelative(0.0f, -3.0f);
        e2.lineToRelative(-2.0f, 0.0f);
        e2.lineToRelative(0.0f, 14.0f);
        e2.lineToRelative(6.68f, 0.0f);
        e2.lineToRelative(-3.51f, -3.5f);
        e2.lineToRelative(4.33f, -4.33f);
        e2.lineToRelative(3.01f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 3.49f, -3.5f, 0.0f, -5.67f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(5.0f, 19.0f, 5.0f, 2.0f, 3.0f);
        af0.q(c, 10.0f, 5.0f, 2.0f, 5.67f);
        c.lineToRelative(2.0f, -2.0f);
        c.lineToRelative(0.0f, 0.0f);
        c.verticalLineTo(5.0f);
        c.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        c.horizontalLineToRelative(-4.18f);
        c.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        c.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        c.horizontalLineTo(5.0f);
        c.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        c.verticalLineToRelative(14.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        uf.A(c, 8.68f, -2.0f, -2.0f, 5.0f);
        c.moveTo(12.0f, 3.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        c.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        c.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 11.45f, 3.0f, 12.0f, 3.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _inventory = build;
        build.getClass();
        return build;
    }
}
