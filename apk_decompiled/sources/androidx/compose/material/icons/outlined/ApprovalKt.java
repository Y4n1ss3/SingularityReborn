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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ApprovalKt {
    private static ImageVector _approval;

    public static final ImageVector getApproval(Icons.Outlined outlined) {
        ImageVector imageVector = _approval;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Approval", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(4.0f, 16.0f, 6.0f, 16.0f, -6.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineTo(6.0f);
        s.curveTo(4.9f, 14.0f, 4.0f, 14.9f, 4.0f, 16.0f);
        uo.q(s, 18.0f, 18.0f, 6.0f, -2.0f);
        uo.r(s, 12.0f, 18.0f, 12.0f, 2.0f);
        s.curveTo(9.24f, 2.0f, 7.0f, 4.24f, 7.0f, 7.0f);
        s.lineToRelative(5.0f, 7.0f);
        s.lineToRelative(5.0f, -7.0f);
        s.curveTo(17.0f, 4.24f, 14.76f, 2.0f, 12.0f, 2.0f);
        k4.r(s, 12.0f, 11.0f, 9.0f, 7.0f);
        s.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        s.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(s, 12.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _approval = build;
        build.getClass();
        return build;
    }
}
