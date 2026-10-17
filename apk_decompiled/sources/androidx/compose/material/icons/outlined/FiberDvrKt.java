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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Outlined outlined) {
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FiberDvr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(11.87f, 12.43f, -1.0f, -3.43f, -1.5f);
        b.lineToRelative(1.75f, 6.0f);
        b.horizontalLineToRelative(1.5f);
        b.lineToRelative(1.75f, -6.0f);
        b.horizontalLineToRelative(-1.5f);
        b.close();
        b.moveTo(21.0f, 11.5f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.85f, -0.65f, -1.5f, -1.5f, -1.5f);
        af0.m(b, 16.0f, 9.0f, 6.0f, 1.5f);
        gy.C(b, -2.0f, 1.15f, 0.85f, 2.0f);
        b.lineTo(21.0f, 15.0f);
        b.lineToRelative(-0.9f, -2.1f);
        b.curveToRelative(0.5f, -0.25f, 0.9f, -0.8f, 0.9f, -1.4f);
        r6.B(b, 19.5f, 11.5f, -2.0f, -1.0f);
        fc.x(b, 2.0f, 1.0f, 6.5f, 9.0f);
        af0.m(b, 3.0f, 9.0f, 6.0f, 3.5f);
        b.curveToRelative(0.85f, 0.0f, 1.5f, -0.65f, 1.5f, -1.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(8.0f, 9.65f, 7.35f, 9.0f, 6.5f, 9.0f);
        r6.B(b, 6.5f, 13.5f, -2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = build;
        build.getClass();
        return build;
    }
}
