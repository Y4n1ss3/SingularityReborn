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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestoreFromTrashKt {
    private static ImageVector _restoreFromTrash;

    public static final ImageVector getRestoreFromTrash(Icons.Outlined outlined) {
        ImageVector imageVector = _restoreFromTrash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RestoreFromTrash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(15.5f, 4.0f, -1.0f, -1.0f, -5.0f);
        b.lineToRelative(-1.0f, 1.0f);
        af0.m(b, 5.0f, 4.0f, 2.0f, 14.0f);
        uo.l(b, 19.0f, 4.0f, 6.0f, 19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(18.0f, 7.0f);
        bv.r(b, 6.0f, 7.0f, 12.0f);
        b.moveTo(8.0f, 14.0f);
        fc.w(b, 8.0f, 9.0f, 8.0f, 10.0f);
        bv.r(b, 8.0f, 19.0f, -5.0f);
        k4.C(b, 10.0f, 18.0f, 4.0f, -4.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(-4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.g(b, -4.0f, 4.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restoreFromTrash = build;
        build.getClass();
        return build;
    }
}
