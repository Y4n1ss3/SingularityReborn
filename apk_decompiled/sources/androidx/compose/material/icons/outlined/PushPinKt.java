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
import defpackage.gy;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PushPinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(Icons.Outlined outlined) {
        ImageVector imageVector = _pushPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PushPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(14.0f, 4.0f, 5.0f);
        h.curveToRelative(0.0f, 1.12f, 0.37f, 2.16f, 1.0f, 3.0f);
        h.horizontalLineTo(9.0f);
        h.curveToRelative(0.65f, -0.86f, 1.0f, -1.9f, 1.0f, -3.0f);
        h.verticalLineTo(4.0f);
        h.horizontalLineTo(14.0f);
        h.moveTo(17.0f, 2.0f);
        h.horizontalLineTo(7.0f);
        h.curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        h.lineToRelative(1.0f, 0.0f);
        h.verticalLineToRelative(5.0f);
        h.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        kf0.z(h, 2.0f, 5.97f, 7.0f);
        h.lineToRelative(1.0f, 1.0f);
        gy.j(h, 1.0f, -1.0f, -7.0f, 19.0f);
        h.verticalLineToRelative(-2.0f);
        h.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        h.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        h.verticalLineTo(4.0f);
        h.lineToRelative(1.0f, 0.0f);
        h.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.curveTo(18.0f, 2.45f, 17.55f, 2.0f, 17.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 17.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pushPin = build;
        build.getClass();
        return build;
    }
}
