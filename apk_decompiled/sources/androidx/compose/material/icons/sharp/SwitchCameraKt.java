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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchCameraKt {
    private static ImageVector _switchCamera;

    public static final ImageVector getSwitchCamera(Icons.Sharp sharp) {
        ImageVector imageVector = _switchCamera;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwitchCamera", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(22.0f, 4.0f, -5.17f, 15.0f, 2.0f);
        p.lineTo(9.0f, 2.0f);
        p.lineTo(7.17f, 4.0f);
        af0.m(p, 2.0f, 4.0f, 16.0f, 20.0f);
        uo.l(p, 22.0f, 4.0f, 15.0f, 15.5f);
        p.lineTo(15.0f, 13.0f);
        p.lineTo(9.0f, 13.0f);
        p.verticalLineToRelative(2.5f);
        p.lineTo(5.5f, 12.0f);
        p.lineTo(9.0f, 8.5f);
        p.lineTo(9.0f, 11.0f);
        p.horizontalLineToRelative(6.0f);
        p.lineTo(15.0f, 8.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 3.5f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchCamera = build;
        build.getClass();
        return build;
    }
}
