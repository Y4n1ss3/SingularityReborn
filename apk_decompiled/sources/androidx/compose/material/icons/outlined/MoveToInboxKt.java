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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoveToInboxKt {
    private static ImageVector _moveToInbox;

    public static final ImageVector getMoveToInbox(Icons.Outlined outlined) {
        ImageVector imageVector = _moveToInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MoveToInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(16.0f, 9.0f, -2.55f, 13.45f, 6.0f);
        bv.C(p, -2.9f, 3.0f, 8.0f, 9.0f);
        fc.B(p, 4.0f, 4.0f, 19.0f, 3.0f);
        p.lineTo(4.99f, 3.0f);
        p.curveTo(3.88f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        p.verticalLineToRelative(14.0f);
        p.curveToRelative(0.0f, 1.1f, 0.88f, 2.0f, 1.99f, 2.0f);
        p.lineTo(19.0f, 21.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(21.0f, 5.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(p, 19.0f, 19.0f, 5.0f, 19.0f);
        p.verticalLineToRelative(-3.0f);
        p.horizontalLineToRelative(3.56f);
        p.curveToRelative(0.69f, 1.19f, 1.97f, 2.0f, 3.45f, 2.0f);
        p.reflectiveCurveToRelative(2.75f, -0.81f, 3.45f, -2.0f);
        bv.r(p, 19.0f, 16.0f, 3.0f);
        p.moveTo(19.0f, 14.0f);
        p.horizontalLineToRelative(-4.99f);
        p.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        p.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        p.lineTo(5.0f, 14.0f);
        p.lineToRelative(-0.01f, -9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 19.0f, 5.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moveToInbox = build;
        build.getClass();
        return build;
    }
}
