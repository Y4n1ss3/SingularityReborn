package androidx.compose.material.icons.sharp;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignLanguageKt {
    private static ImageVector _signLanguage;

    public static final ImageVector getSignLanguage(Icons.Sharp sharp) {
        ImageVector imageVector = _signLanguage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SignLanguage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.49f, 13.0f, -1.39f, -2.7f);
        e.lineTo(12.49f, 9.0f);
        uf.u(e, 19.0f, 15.2f, 24.0f, 4.5f);
        af0.s(e, -2.0f, 10.0f, -1.0f, 3.0f);
        uf.s(e, -2.0f, 7.0f, -1.0f, 2.0f);
        uf.s(e, -2.0f, 8.0f, -1.0f, 3.5f);
        kf0.n(e, -2.0f, 12.49f, 11.78f, 7.12f);
        e.curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f);
        e.lineTo(6.76f, 4.74f);
        gy.B(e, 1.45f, -1.38f, 11.78f, 7.12f);
        e.moveTo(9.64f, 9.21f);
        e.curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f);
        e.horizontalLineTo(8.58f);
        e.lineTo(5.62f, 7.89f);
        gy.B(e, 1.45f, -1.38f, 9.64f, 9.21f);
        e.moveTo(21.98f, 12.34f);
        e.lineTo(22.0f, 3.35f);
        e.lineToRelative(-1.9f, -0.1f);
        e.lineToRelative(-1.0f, 2.86f);
        e.lineTo(13.3f, 0.0f);
        e.lineToRelative(-1.45f, 1.38f);
        e.lineToRelative(4.09f, 4.3f);
        e.lineToRelative(-0.73f, 0.69f);
        e.lineTo(9.74f, 0.64f);
        e.lineTo(8.3f, 2.0f);
        e.lineToRelative(3.36f, 3.53f);
        e.lineToRelative(1.06f, 1.11f);
        e.lineToRelative(2.65f, 2.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 5.08f, 4.83f, 21.98f, 12.34f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signLanguage = build;
        build.getClass();
        return build;
    }
}
