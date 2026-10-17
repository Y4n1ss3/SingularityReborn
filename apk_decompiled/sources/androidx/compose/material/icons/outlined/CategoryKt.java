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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CategoryKt {
    private static ImageVector _category;

    public static final ImageVector getCategory(Icons.Outlined outlined) {
        ImageVector imageVector = _category;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Category", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(12.0f, 2.0f, -5.5f, 9.0f, 11.0f);
        uo.l(b, 12.0f, 2.0f, 12.0f, 5.84f);
        b.lineTo(13.93f, 9.0f);
        gy.n(b, -3.87f, 12.0f, 5.84f);
        b.moveTo(17.5f, 13.0f);
        b.curveToRelative(-2.49f, 0.0f, -4.5f, 2.01f, -4.5f, 4.5f);
        b.reflectiveCurveToRelative(2.01f, 4.5f, 4.5f, 4.5f);
        b.reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f);
        b.reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f);
        b.close();
        b.moveTo(17.5f, 20.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f);
        r6.B(b, 3.0f, 21.5f, 8.0f, -8.0f);
        bv.r(b, 3.0f, 13.5f, 8.0f);
        k4.C(b, 5.0f, 15.5f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(b, 5.0f, 19.5f, -4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _category = build;
        build.getClass();
        return build;
    }
}
