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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncProblemKt {
    private static ImageVector _syncProblem;

    public static final ImageVector getSyncProblem(Icons.TwoTone twoTone) {
        ImageVector imageVector = _syncProblem;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SyncProblem", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 12.0f);
        b.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        fc.w(b, 3.0f, 20.0f, 6.0f, -6.0f);
        b.lineToRelative(-2.24f, 2.24f);
        b.curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f);
        b.curveToRelative(0.0f, -2.61f, 1.67f, -4.83f, 4.0f, -5.65f);
        b.lineTo(9.0f, 4.26f);
        b.curveTo(5.55f, 5.15f, 3.0f, 8.27f, 3.0f, 12.0f);
        r6.B(b, 11.0f, 17.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 21.0f, 4.0f);
        bv.p(b, -6.0f, 6.0f, 2.24f, -2.24f);
        b.curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f);
        b.curveToRelative(0.0f, 2.61f, -1.67f, 4.83f, -4.0f, 5.65f);
        b.verticalLineToRelative(2.09f);
        b.curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f);
        b.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        uo.l(b, 21.0f, 4.0f, 11.0f, 13.0f);
        uo.n(b, 2.0f, 13.0f, 7.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncProblem = build;
        build.getClass();
        return build;
    }
}
