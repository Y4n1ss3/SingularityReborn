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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IosShareKt {
    private static ImageVector _iosShare;

    public static final ImageVector getIosShare(Icons.Outlined outlined) {
        ImageVector imageVector = _iosShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.IosShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.0f, 5.0f, -1.42f, 1.42f);
        fc.u(e, -1.59f, -1.59f, 16.0f, -1.98f);
        e.verticalLineTo(4.83f);
        e.lineTo(9.42f, 6.42f);
        e.lineTo(8.0f, 5.0f);
        gy.B(e, 4.0f, -4.0f, 16.0f, 5.0f);
        e.moveTo(20.0f, 10.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(10.0f);
        e.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        af0.z(e, 3.0f, 2.0f, 6.0f, 11.0f);
        af0.n(e, 12.0f, 10.0f, -3.0f, 8.0f);
        e.horizontalLineToRelative(3.0f);
        e.curveTo(19.1f, 8.0f, 20.0f, 8.89f, 20.0f, 10.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iosShare = build;
        build.getClass();
        return build;
    }
}
