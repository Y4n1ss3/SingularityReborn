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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartButtonKt {
    private static ImageVector _smartButton;

    public static final ImageVector getSmartButton(Icons.TwoTone twoTone) {
        ImageVector imageVector = _smartButton;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SmartButton", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 9.0f, 6.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        kf0.B(h, -1.0f, 0.0f, -2.0f, 1.0f);
        bv.A(h, 9.0f, 4.0f, 6.0f, 6.0f);
        h.verticalLineToRelative(2.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(9.0f);
        h.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        h.horizontalLineToRelative(16.0f);
        h.curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f);
        k4.x(h, 14.5f, 19.0f, 1.09f, -2.41f);
        h.lineTo(18.0f, 15.5f);
        h.lineToRelative(-2.41f, -1.09f);
        h.lineTo(14.5f, 12.0f);
        h.lineToRelative(-1.09f, 2.41f);
        h.lineTo(11.0f, 15.5f);
        gy.B(h, 2.41f, 1.09f, 14.5f, 19.0f);
        h.moveTo(17.0f, 14.0f);
        h.lineToRelative(0.62f, -1.38f);
        h.lineTo(19.0f, 12.0f);
        h.lineToRelative(-1.38f, -0.62f);
        h.lineTo(17.0f, 10.0f);
        h.lineToRelative(-0.62f, 1.38f);
        h.lineTo(15.0f, 12.0f);
        gy.B(h, 1.38f, 0.62f, 17.0f, 14.0f);
        h.moveTo(14.5f, 19.0f);
        h.lineToRelative(1.09f, -2.41f);
        h.lineTo(18.0f, 15.5f);
        h.lineToRelative(-2.41f, -1.09f);
        h.lineTo(14.5f, 12.0f);
        h.lineToRelative(-1.09f, 2.41f);
        h.lineTo(11.0f, 15.5f);
        gy.B(h, 2.41f, 1.09f, 14.5f, 19.0f);
        h.moveTo(17.0f, 14.0f);
        h.lineToRelative(0.62f, -1.38f);
        h.lineTo(19.0f, 12.0f);
        h.lineToRelative(-1.38f, -0.62f);
        h.lineTo(17.0f, 10.0f);
        h.lineToRelative(-0.62f, 1.38f);
        h.lineTo(15.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(h, 1.38f, 0.62f, 17.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartButton = build;
        build.getClass();
        return build;
    }
}
