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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EmojiFoodBeverageKt {
    private static ImageVector _emojiFoodBeverage;

    public static final ImageVector getEmojiFoodBeverage(Icons.Outlined outlined) {
        ImageVector imageVector = _emojiFoodBeverage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EmojiFoodBeverage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(2.0f, 19.0f, 18.0f, 2.0f, -18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(20.0f, 3.0f, 4.0f, 10.0f);
        q.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        q.horizontalLineToRelative(6.0f);
        q.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        q.verticalLineToRelative(-3.0f);
        q.horizontalLineToRelative(2.0f);
        q.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        q.verticalLineTo(5.0f);
        q.curveTo(22.0f, 3.89f, 21.11f, 3.0f, 20.0f, 3.0f);
        q.close();
        q.moveTo(16.0f, 13.0f);
        q.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        q.horizontalLineTo(8.0f);
        q.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        kf0.r(q, 5.0f, 3.0f, 1.4f);
        q.lineTo(7.19f, 7.85f);
        q.curveTo(7.07f, 7.94f, 7.0f, 8.09f, 7.0f, 8.24f);
        q.verticalLineToRelative(4.26f);
        q.curveTo(7.0f, 12.78f, 7.22f, 13.0f, 7.5f, 13.0f);
        q.horizontalLineToRelative(4.0f);
        q.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        q.verticalLineTo(8.24f);
        q.curveToRelative(0.0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f);
        fc.t(q, 10.0f, 6.4f, 5.0f, 6.0f);
        bv.t(q, 13.0f, 9.5f, 7.28f);
        uo.x(q, 1.5f, 1.2f, 12.0f, 8.0f);
        bv.k(q, 8.48f, 9.5f, 7.28f);
        j50.y(q, 20.0f, 8.0f, -2.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(q, 2.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiFoodBeverage = build;
        build.getClass();
        return build;
    }
}
