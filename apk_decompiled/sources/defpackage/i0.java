package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class i0 implements Future {
    public static final boolean g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger h = Logger.getLogger(i0.class.getName());
    public static final p10 i;
    public static final Object j;
    public volatile Object d;
    public volatile e0 e;
    public volatile h0 f;

    static {
        p10 g0Var;
        try {
            g0Var = new f0(AtomicReferenceFieldUpdater.newUpdater(h0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h0.class, h0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i0.class, h0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(i0.class, e0.class, "e"), AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            g0Var = new g0();
        }
        i = g0Var;
        if (th != null) {
            h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        j = new Object();
    }

    public static void b(i0 i0Var) {
        h0 h0Var;
        e0 e0Var;
        do {
            h0Var = i0Var.f;
        } while (!i.k(i0Var, h0Var, h0.c));
        while (h0Var != null) {
            Thread thread = h0Var.a;
            if (thread != null) {
                h0Var.a = null;
                LockSupport.unpark(thread);
            }
            h0Var = h0Var.b;
        }
        do {
            e0Var = i0Var.e;
        } while (!i.i(i0Var, e0Var));
        e0 e0Var2 = null;
        while (e0Var != null) {
            e0 e0Var3 = e0Var.a;
            e0Var.a = e0Var2;
            e0Var2 = e0Var;
            e0Var = e0Var3;
        }
        while (e0Var2 != null) {
            e0Var2 = e0Var2.a;
            try {
                throw null;
            } catch (RuntimeException e) {
                h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof c0) {
            Throwable th = ((c0) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d0) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == j) {
            return null;
        }
        return obj;
    }

    public static Object d(i0 i0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = i0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d == this ? "this future" : String.valueOf(d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.d;
        if (obj != null) {
            return false;
        }
        if (!i.j(this, obj, g ? new c0(new CancellationException("Future.cancel() was called."), z) : z ? c0.b : c0.c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(h0 h0Var) {
        h0Var.a = null;
        while (true) {
            h0 h0Var2 = this.f;
            if (h0Var2 == h0.c) {
                return;
            }
            h0 h0Var3 = null;
            while (h0Var2 != null) {
                h0 h0Var4 = h0Var2.b;
                if (h0Var2.a != null) {
                    h0Var3 = h0Var2;
                } else if (h0Var3 != null) {
                    h0Var3.b = h0Var4;
                    if (h0Var3.a == null) {
                        break;
                    }
                } else if (!i.k(this, h0Var2, h0Var4)) {
                    break;
                }
                h0Var2 = h0Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        h0 h0Var = h0.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h0 h0Var2 = this.f;
            if (h0Var2 != h0Var) {
                h0 h0Var3 = new h0();
                do {
                    p10 p10Var = i;
                    p10Var.B(h0Var3, h0Var2);
                    if (p10Var.k(this, h0Var2, h0Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(h0Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(h0Var3);
                    } else {
                        h0Var2 = this.f;
                    }
                } while (h0Var2 != h0Var);
            }
            return c(this.d);
        }
        while (nanos > 0) {
            Object obj3 = this.d;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String i0Var = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String concat = str.concat(" (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = concat + convert + " " + lowerCase;
                if (z) {
                    str2 = str2.concat(",");
                }
                concat = str2.concat(" ");
            }
            if (z) {
                concat = concat + nanos2 + " nanoseconds ";
            }
            str = concat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(str.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(uo.d(str, " for ", i0Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.d != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof c0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        h0 h0Var = h0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if (obj2 != null) {
                return c(obj2);
            }
            h0 h0Var2 = this.f;
            if (h0Var2 != h0Var) {
                h0 h0Var3 = new h0();
                do {
                    p10 p10Var = i;
                    p10Var.B(h0Var3, h0Var2);
                    if (p10Var.k(this, h0Var2, h0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                e(h0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    h0Var2 = this.f;
                } while (h0Var2 != h0Var);
            }
            return c(this.d);
        }
        throw new InterruptedException();
    }
}
