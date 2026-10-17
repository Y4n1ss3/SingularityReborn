package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.unit.Density;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PlatformMagnifierFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                return PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            lu0.a("Magnifier is only supported on API level 28 and higher.");
            return null;
        }
    }

    /* renamed from: create-nHHXs2Y, reason: not valid java name */
    PlatformMagnifier mo317createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3);

    boolean getCanUpdateZoom();
}
