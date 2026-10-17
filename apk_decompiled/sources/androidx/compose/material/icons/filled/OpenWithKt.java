package androidx.compose.material.icons.filled;

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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpenWithKt {
    private static ImageVector _openWith;

    public static final ImageVector getOpenWith(Icons.Filled filled) {
        ImageVector imageVector = _openWith;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.OpenWith", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(10.0f, 9.0f, 4.0f, 14.0f, 6.0f);
        p.horizontalLineToRelative(3.0f);
        p.lineToRelative(-5.0f, -5.0f);
        p.lineToRelative(-5.0f, 5.0f);
        p.horizontalLineToRelative(3.0f);
        p.verticalLineToRelative(3.0f);
        p.close();
        p.moveTo(9.0f, 10.0f);
        p.lineTo(6.0f, 10.0f);
        p.lineTo(6.0f, 7.0f);
        p.lineToRelative(-5.0f, 5.0f);
        r6.A(p, 5.0f, 5.0f, -3.0f, 3.0f);
        r6.l(p, -4.0f, 23.0f, 12.0f);
        r6.A(p, -5.0f, -5.0f, 3.0f, -3.0f);
        kf0.z(p, 4.0f, 3.0f, 3.0f);
        fc.B(p, 5.0f, -5.0f, 14.0f, 15.0f);
        bv.C(p, -4.0f, 3.0f, 7.0f, 18.0f);
        p.lineToRelative(5.0f, 5.0f);
        p.lineToRelative(5.0f, -5.0f);
        p.horizontalLineToRelative(-3.0f);
        p.verticalLineToRelative(-3.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openWith = build;
        build.getClass();
        return build;
    }
}
