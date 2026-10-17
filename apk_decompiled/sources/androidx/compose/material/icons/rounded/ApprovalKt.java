package androidx.compose.material.icons.rounded;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ApprovalKt {
    private static ImageVector _approval;

    public static final ImageVector getApproval(Icons.Rounded rounded) {
        ImageVector imageVector = _approval;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Approval", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(4.0f, 16.0f, 4.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(12.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineTo(6.0f);
        h.curveTo(4.9f, 14.0f, 4.0f, 14.9f, 4.0f, 16.0f);
        r6.g(h, 17.0f, 18.0f, 7.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        h.verticalLineToRelative(0.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.horizontalLineToRelative(10.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        h.verticalLineToRelative(0.0f);
        h.curveTo(18.0f, 17.55f, 17.55f, 18.0f, 17.0f, 18.0f);
        h.close();
        h.moveTo(12.0f, 2.0f);
        h.curveTo(9.54f, 2.0f, 7.48f, 3.79f, 7.07f, 6.13f);
        h.curveTo(6.99f, 6.65f, 7.13f, 7.18f, 7.43f, 7.6f);
        h.lineToRelative(3.76f, 5.26f);
        h.curveToRelative(0.4f, 0.56f, 1.23f, 0.56f, 1.63f, 0.0f);
        h.lineToRelative(3.76f, -5.26f);
        h.curveToRelative(0.3f, -0.42f, 0.44f, -0.95f, 0.35f, -1.47f);
        h.curveTo(16.52f, 3.79f, 14.46f, 2.0f, 12.0f, 2.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _approval = build;
        build.getClass();
        return build;
    }
}
