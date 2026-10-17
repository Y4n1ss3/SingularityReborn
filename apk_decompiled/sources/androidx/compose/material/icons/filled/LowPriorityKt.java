package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LowPriorityKt {
    private static ImageVector _lowPriority;

    public static final ImageVector getLowPriority(Icons.Filled filled) {
        ImageVector imageVector = _lowPriority;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LowPriority", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(14.0f, 5.0f, 8.0f, 2.0f, -8.0f);
        k4.C(q, 14.0f, 10.5f, 8.0f, 2.0f);
        kp0.A(q, -8.0f, 14.0f, 16.0f, 8.0f);
        kf0.C(q, 2.0f, -8.0f, 2.0f, 11.5f);
        q.curveTo(2.0f, 15.08f, 4.92f, 18.0f, 8.5f, 18.0f);
        q.lineTo(9.0f, 18.0f);
        q.verticalLineToRelative(2.0f);
        q.lineToRelative(3.0f, -3.0f);
        r6.A(q, -3.0f, -3.0f, 2.0f, -0.5f);
        q.curveTo(6.02f, 16.0f, 4.0f, 13.98f, 4.0f, 11.5f);
        q.reflectiveCurveTo(6.02f, 7.0f, 8.5f, 7.0f);
        q.lineTo(12.0f, 7.0f);
        q.lineTo(12.0f, 5.0f);
        q.lineTo(8.5f, 5.0f);
        q.curveTo(4.92f, 5.0f, 2.0f, 7.92f, 2.0f, 11.5f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lowPriority = build;
        build.getClass();
        return build;
    }
}
