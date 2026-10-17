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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MoveToInboxKt {
    private static ImageVector _moveToInbox;

    public static final ImageVector getMoveToInbox(Icons.TwoTone twoTone) {
        ImageVector imageVector = _moveToInbox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MoveToInbox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.01f, 18.0f);
        b.curveToRelative(-1.48f, 0.0f, -2.75f, -0.81f, -3.45f, -2.0f);
        uf.k(b, 5.0f, 3.0f, 14.0f, -3.0f);
        b.horizontalLineToRelative(-3.55f);
        b.curveToRelative(-0.69f, 1.19f, -1.97f, 2.0f, -3.44f, 2.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 19.0f, 5.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moveToInbox = build;
        build.getClass();
        return build;
    }
}
