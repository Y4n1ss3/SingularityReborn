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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WbSunny", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.5f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.79f, -4.0f, -4.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(5.34f, 6.25f, 1.42f, -1.41f);
        fc.C(e, -1.8f, -1.79f, -1.41f, 1.41f);
        k4.C(e, 1.0f, 10.5f, 3.0f, 2.0f);
        uo.l(e, 1.0f, 12.5f, 11.0f, 0.55f);
        uf.C(e, 2.0f, 13.0f, 3.5f, -2.0f);
        e.moveTo(18.66f, 6.255f);
        e.lineToRelative(-1.41f, -1.407f);
        fc.C(e, 1.79f, -1.79f, 1.406f, 1.41f);
        e.moveTo(17.24f, 18.16f);
        e.lineToRelative(1.79f, 1.8f);
        fc.C(e, 1.41f, -1.41f, -1.8f, -1.79f);
        k4.C(e, 20.0f, 10.5f, 3.0f, 2.0f);
        j50.t(e, -3.0f, 12.0f, 5.5f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        e.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        e.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        e.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        e.close();
        e.moveTo(12.0f, 15.5f);
        e.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        e.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        e.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        e.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        r6.B(e, 11.0f, 19.5f, 2.0f, 2.95f);
        j50.t(e, -2.0f, 3.55f, 18.54f);
        e.lineToRelative(1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 1.79f, -1.8f, -1.41f, -1.41f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbSunny = build;
        build.getClass();
        return build;
    }
}
