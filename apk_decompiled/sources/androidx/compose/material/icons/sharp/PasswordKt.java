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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PasswordKt {
    private static ImageVector _password;

    public static final ImageVector getPassword(Icons.Sharp sharp) {
        ImageVector imageVector = _password;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Password", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(2.0f, 17.0f, 20.0f, 2.0f, 2.0f);
        bv.t(d, 17.0f, 3.15f, 12.95f);
        d.lineTo(4.0f, 11.47f);
        d.lineToRelative(0.85f, 1.48f);
        d.lineToRelative(1.3f, -0.75f);
        r6.w(d, 5.3f, 10.72f, 7.0f, -1.5f);
        d.horizontalLineTo(5.3f);
        d.lineToRelative(0.85f, -1.47f);
        d.lineTo(4.85f, 7.0f);
        d.lineTo(4.0f, 8.47f);
        d.lineTo(3.15f, 7.0f);
        d.lineToRelative(-1.3f, 0.75f);
        r6.w(d, 2.7f, 9.22f, 1.0f, 1.5f);
        d.horizontalLineToRelative(1.7f);
        r6.C(d, 1.85f, 12.2f, 3.15f, 12.95f);
        d.moveTo(9.85f, 12.2f);
        d.lineToRelative(1.3f, 0.75f);
        d.lineTo(12.0f, 11.47f);
        d.lineToRelative(0.85f, 1.48f);
        d.lineToRelative(1.3f, -0.75f);
        j50.x(d, -0.85f, -1.48f, 15.0f, -1.5f);
        d.horizontalLineToRelative(-1.7f);
        d.lineToRelative(0.85f, -1.47f);
        d.lineTo(12.85f, 7.0f);
        d.lineTo(12.0f, 8.47f);
        d.lineTo(11.15f, 7.0f);
        d.lineToRelative(-1.3f, 0.75f);
        j50.x(d, 0.85f, 1.47f, 9.0f, 1.5f);
        gy.n(d, 1.7f, 9.85f, 12.2f);
        d.moveTo(23.0f, 9.22f);
        d.horizontalLineToRelative(-1.7f);
        d.lineToRelative(0.85f, -1.47f);
        d.lineTo(20.85f, 7.0f);
        d.lineTo(20.0f, 8.47f);
        d.lineTo(19.15f, 7.0f);
        d.lineToRelative(-1.3f, 0.75f);
        j50.x(d, 0.85f, 1.47f, 17.0f, 1.5f);
        d.horizontalLineToRelative(1.7f);
        d.lineToRelative(-0.85f, 1.48f);
        d.lineToRelative(1.3f, 0.75f);
        d.lineTo(20.0f, 11.47f);
        d.lineToRelative(0.85f, 1.48f);
        d.lineToRelative(1.3f, -0.75f);
        d.lineToRelative(-0.85f, -1.48f);
        d.horizontalLineTo(23.0f);
        d.verticalLineTo(9.22f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _password = build;
        build.getClass();
        return build;
    }
}
